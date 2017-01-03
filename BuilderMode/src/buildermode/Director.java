package buildermode;

/**
 * Describe: 负责构造Computer
 * wx on 2017/1/3.
 */
public class Director {


    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建对象
     * @param board
     * @param display
     */
    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildBoard(display);
        builder.buildOs();
    }
}
