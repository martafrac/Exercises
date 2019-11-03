package tutorial.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String num = String.valueOf(createNumber());
        cutNumer(num);
    }

    private static int createNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number");
        int num = sc.nextInt();
        System.out.println("Number is" + num);
        return num;

    }

    private static void cutNumer(String num) {
        char[] tab = num.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

}