package tutorial.loops;

import java.util.Scanner;
public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int num= sc.nextInt();
        //printNumbers(num);
        printNumber2(num);
    }

    private static void printNumbers(int length) {
        for (int i = 0; i <= length; i++) {
            System.out.println(i);
        }
    }
    private static void printNumber2(int length){
        int min=0;
        while(length>min) {
            System.out.println(min);
            min++;
        }
        System.out.println(length);
    }
}
