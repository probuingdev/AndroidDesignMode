package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;

/**
 * Describe:双缓存类 先从内存中取图片，内存中没有从本地取图片
 * wx on 2016/12/27.
 */
public class DoubleCache implements ImageCache {
    // TODO: 构造内存缓存
    MemoryCache mMemorycache = new MemoryCache();
    DiskCache mDiskCache = new DiskCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemorycache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        // TODO: 将图片缓存到内存和SDcard中
        mMemorycache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }
}
