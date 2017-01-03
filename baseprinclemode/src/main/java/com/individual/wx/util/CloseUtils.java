package com.individual.wx.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Describe:closeable接口实现类的关闭工具
 * wx on 2016/12/28.
 */
public class CloseUtils {
    private CloseUtils() {

    }

    public static final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
