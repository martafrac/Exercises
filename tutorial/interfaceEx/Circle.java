package tutorial.interfaceEx;

public class Circle implements Figure {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return (2 * Math.PI * r);
    }

    @Override
    public double getArea() {
        return (Math.PI * r * r);
    }
}
