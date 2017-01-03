package com.individual.wx.singlemode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Describe:容器单例
 * wx on 2016/12/29.
 */
public class SingleTonManager {
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    private SingleTonManager() {
    }

    public static void regiserService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}
