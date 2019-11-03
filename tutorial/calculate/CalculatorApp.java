package tutorial.calculate;

import tutorial.calculate.CalculateClass;
import tutorial.calculate.Calculator;

import java.util.Scanner;

public class CalculatorApp {


    public static void main(String[] args) {
        Calculator calc = getCalculator();
        CalculateClass.printInfo(calc);


    }

    private static Calculator getCalculator() {
        Calculator calc= new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Write first number");
        calc.setFirst(input.nextDouble());
        System.out.println("Write an operation");
        calc.setOperation( input.next());
        System.out.println("Write second number");
        calc.setSecond(input.nextInt());
        return calc;
    }
}
