package com.individual.wx.singlemode.singleton;

/**
 * Describe:静态内部类实现单例模式
 * wx on 2016/12/29.
 */
public class InnerSingleTon {
    private InnerSingleTon(){}
    public static InnerSingleTon getInstance(){
        return InnerSingleTonHolder.sInstance;
    }

    private static class InnerSingleTonHolder {

        public static InnerSingleTon sInstance = new InnerSingleTon();

    }


}
