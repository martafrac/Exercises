package tutorial.objectsandpackages;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = 10;
    }

    private boolean isOdd() {
        return number % 2 != 0;
    }

    private boolean isEven() {
        return number % 2 == 0;
    }

    private double sqrt() {
        return Math.sqrt(number);
    }

    private double power(MyNumber x) {
        return Math.pow((double) number, x.number);
    }

    private int add(MyNumber x) {
        return number + x.number;
    }

    private int substract(MyNumber x) {
        return number - x.number;
    }
}
