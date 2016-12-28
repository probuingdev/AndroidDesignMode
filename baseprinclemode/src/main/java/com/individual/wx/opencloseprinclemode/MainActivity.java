package com.individual.wx.opencloseprinclemode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 使用ImageLoader
        ImageView view = new ImageView(this);
        ImageLoader imageLoader = new ImageLoader();
        // TODO: 缓存加载策略
        imageLoader.setImageCache(new MemoryCache());
        // TODO: 磁盘加载策略
        imageLoader.setImageCache(new DiskCache());
        // TODO: 双缓存加载策略
        imageLoader.setImageCache(new DoubleCache());
        // TODO: 自定义加载策略
        imageLoader.setImageCache(new ImageCache() {
            @Override
            public Bitmap get(String url) {

                return null;
            }

            @Override
            public void put(String url, Bitmap bitmap) {
                // TODO: 缓存图片
            }
        });
    }
}
