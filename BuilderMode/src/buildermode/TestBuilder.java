package buildermode;

/**
 * Describe:测试程序
 * wx on 2017/1/3.
 */
public class TestBuilder {

    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");
        // TODO: 构建
        Computer computer = builder.create();
        System.out.println(computer.toString());
    }
}
