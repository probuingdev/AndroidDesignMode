package buildermode;

/**
 * Describe:抽象Builder类 用于构建product
 * wx on 2017/1/3.
 */
public abstract class Builder {
    /**
     * 设置主板
     *
     * @param board
     */
    public abstract void buildBoard(String board);

    /**
     * 设置显示器
     *
     * @param display
     */
    public abstract void buildDisplay(String display);

    /**
     * 设置操作系统
     */
    public abstract void buildOs();

    /**
     * 创建Computer
     *
     * @return
     */
    public abstract Computer create();
}
