package tutorial.interfaceEx;

import static java.lang.Math.*;

public class Triangle implements Figure {
    private int a;
    private int b;
    private double c;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.c= sqrt(pow(a,2)+ pow(b,2));
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        return (a*b)/2;
    }
}
