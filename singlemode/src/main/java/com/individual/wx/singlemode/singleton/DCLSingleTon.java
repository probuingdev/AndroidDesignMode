package com.individual.wx.singlemode.singleton;

/**
 * Describe:Double Check Lock 实现单例模式
 * wx on 2016/12/29.
 */
public class DCLSingleTon {


    private static DCLSingleTon instance = null;

    private DCLSingleTon() {
    }

    public static DCLSingleTon getInstance() {
        // TODO: 第一次判空为了避免不必要的同步
        if (instance == null) {

            synchronized (SingleTon.class) {
                // TODO: 第二次判空为了没有实例时创建实例对象
                if (instance == null) {
                    instance = new DCLSingleTon();
                }
            }
        }
        return instance;
    }

}
