package tutorial.interfaceEx;

public class Rectangle implements Figure {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimetr() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
