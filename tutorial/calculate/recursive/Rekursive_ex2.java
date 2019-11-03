package tutorial.calculate.recursive;

import java.util.Scanner;

public class Rekursive_ex2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many number would you like to add?");
        int counter = sc.nextInt();
        int sum= sum(counter);
        System.out.println(sum);
    }

    private static int sum(int counter) {
        int sum = 0;
        if (counter > 0) {
            System.out.println("Write number");
            int num = sc.nextInt();
            sum =num+ sum(--counter);
        }
        return sum;
    }
}
