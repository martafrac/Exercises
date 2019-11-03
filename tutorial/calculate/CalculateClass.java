package tutorial.calculate;

public class CalculateClass {

    public static void printInfo(Calculator calc) {

        double a= calc.getFirst();
        double b= calc.getSecond();
        switch (calc.getOperation()) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("You write wrong char, please write it again");
                break;
        }


    }

}
