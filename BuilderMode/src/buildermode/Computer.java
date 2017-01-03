package buildermode;

/**
 * Describe: 构建者模式 Computer实体类
 * wx on 2017/1/3.
 */
public abstract class Computer {
    /**
     * 实体属性
     */
    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected  Computer(){}

    /**
     * 设置主板
     * @param mBoard
     */
    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }


    /**
     * 设置显示器
     * @param mDisplay
     */
    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }


    /**
     * 设置操作系统 抽象方法
     */
    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }


}
