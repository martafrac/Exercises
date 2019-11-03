package tutorial.methods;

import static java.lang.Math.*;

class MethodsExercise {
    private int age = 20;

    int getAge() {
        return age;
    }

    String getName() {
        return "Zosia";
    }

    void calculation(int a, int b) {
        int sum = a + b;
        int substraction = a - b;
        int multipication = a * b;
        System.out.println("Sum is " + sum + " subtraction is " + substraction + " multiplication " + multipication);
    }

    boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    boolean isDivideByThreeAndFive(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    double countthirdPower(double num) {
        return pow(num, 3);
    }

    double countSqrt(double num) {
        return sqrt(num);
    }

    boolean isTrianglePossible(int a, int b, int c) {
        return (a + b > c && b + c > a && a + c > b);
    }
}