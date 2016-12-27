package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/**
 * Describe:内存缓存实现类 继承图片缓存接口
 * wx on 2016/12/27.
 */

public class MemoryCache implements ImageCache {
    // TODO: LRU缓存集合
    private LruCache<String, Bitmap> mMemeryCache;

    /**
     * 初始化内存缓存方法
     */
    public MemoryCache() {
    }

    @Override
    public Bitmap get(String url) {
        // TODO: 取图片时从集合中根据相应的url从集合中取出
        return mMemeryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        // TODO: 存储图片缓存时放入集合中
        mMemeryCache.put(url, bitmap);

    }

}
