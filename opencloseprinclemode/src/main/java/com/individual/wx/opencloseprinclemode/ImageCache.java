package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Describe: 图片缓存接口
 * wx on 2016/12/27.
 */
public interface ImageCache {
    /**
     * 设置图片方法
     *
     * @param url
     * @return
     */
    Bitmap get(String url);

    /**
     * 取出图片方法
     *
     * @param url    地址
     * @param bitmap 存储的图片
     */
    void put(String url, Bitmap bitmap);

}
