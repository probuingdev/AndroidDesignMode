package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;

/**
 * Describe:磁盘缓存
 * wx on 2016/12/27.
 */
public class DiskCache implements ImageCache {

    @Override
    public Bitmap get(String url) {
        // TODO: 从本地文件中获取图片
        return null;
    }
    @Override
    public void put(String url, Bitmap bitmap) {
        // TODO: 将Bitmap写入到本地文件中
    }
}


