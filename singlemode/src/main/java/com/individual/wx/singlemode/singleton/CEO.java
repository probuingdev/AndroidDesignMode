package com.individual.wx.singlemode.singleton;

/**
 * Describe:CEO模型
 * wx on 2016/12/29.
 */
public class CEO extends Staff {
    private static CEO ceo = new CEO();

    /**
     * 私有构造方法
     */
    private CEO() {

    }

    /**
     * 静态提供实例方法
     */
    public static CEO getInstance() {

        return ceo;
    }



    @Override
    public void work() {
        System.out.println("ceo manager staff");
    }
}
