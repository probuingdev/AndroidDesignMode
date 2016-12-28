package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Describe:图片加载工具类
 * 运用开闭原则，通过拓展的方式实现修改与变化，对于源代码只在处理错误的时候才进行修改
 * wx on 2016/12/27.
 */
public class ImageLoader {

    // TODO:图片缓存
    ImageCache mImageCache = new MemoryCache();
    // TODO: 线程池
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    // TODO: 注入缓存实现

    public void setImageCache(ImageCache imageCache) {
        mImageCache = imageCache;
    }

    public void displayImage(String imageUrl, ImageView mImageView) {
        Bitmap bitmap = mImageCache.get(imageUrl);
        if (bitmap != null) {
            mImageView.setImageBitmap(bitmap);
            return;
        }
        // TODO: 图片没缓存，启动线程下载图片
        submitLoadRequest(imageUrl, mImageView);
    }

    /**
     * 下载图片动作
     *
     * @param imageUrl   图片地址
     * @param mImageView 要加载的图片view
     */
    private void submitLoadRequest(final String imageUrl, final ImageView mImageView) {
        // TODO: 标记设置
        mImageView.setTag(imageUrl);
        // TODO: 启动线程池执行
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    return;
                }
                if (mImageView.getTag().equals(imageUrl)) {
                    mImageView.setImageBitmap(bitmap);
                }
                // TODO: 缓存图片
                mImageCache.put(imageUrl,bitmap);
            }
        });
    }

    /**
     * 下载图片具体实现
     *
     * @param imageUrl
     * @return
     */
    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return bitmap;
    }
}
