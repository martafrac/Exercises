package tutorial.prymitives;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab= createTab(sc);
        printTable(tab);


    }

    private static int[] createTab(Scanner sc) {
        System.out.println("Write length of table");
        int length = sc.nextInt();

        int[] tabNumber = new int[length];

        while (length > 0) {
            int i = 0;
            System.out.println("Write numbers");
            tabNumber[i] = sc.nextInt();
            length--;
            i++;

        }
        return tabNumber;
    }
    private static void printTable(int[] tab){
        for (int num:tab
             ) {
            System.out.println(num);

        }
    }

}