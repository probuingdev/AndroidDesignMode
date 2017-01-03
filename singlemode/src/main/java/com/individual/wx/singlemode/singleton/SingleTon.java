package com.individual.wx.singlemode.singleton;

/**
 * Describe:懒汉式单例模式
 * wx on 2016/12/29.
 */
public class SingleTon {

    public static SingleTon instance;

    private SingleTon() {
    }

    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

}
