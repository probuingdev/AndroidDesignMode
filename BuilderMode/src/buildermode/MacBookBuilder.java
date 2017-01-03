package buildermode;

/**
 * Describe:
 * wx on 2017/1/3.
 */
public class MacBookBuilder extends Builder {
    private Computer computer = new MacBook();

    @Override
    public void buildBoard(String board) {
        computer.mBoard = board;
    }

    @Override
    public void buildDisplay(String display) {
        computer.mDisplay = display;
    }

    @Override
    public void buildOs() {
        computer.setOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
