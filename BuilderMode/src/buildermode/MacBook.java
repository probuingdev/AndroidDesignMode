package buildermode;

/**
 * Describe:具体的Computer类 MacBook
 * wx on 2017/1/3.
 */
public class MacBook extends Computer {

    protected MacBook() {
    }


    @Override
    public void setOs() {
        mOs = "Mac os x 10.10";
    }
}
