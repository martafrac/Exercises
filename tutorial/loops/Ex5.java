package tutorial.loops;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        String word = createAwORD();
        String reverseWord = reverseWord(word);
        System.out.println(reverseWord);
    }

    private static String createAwORD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write word");
        String word = sc.nextLine();
        System.out.println("Word is " + word);
        return word;
    }

    private static String reverseWord(String word) {
        char[] tab = word.toCharArray();
        int length = word.length() - 1;

        for (int i = 0; i <= length / 2; i++) {
            char temp = tab[i];
            tab[i] = tab[length - i];
            tab[length - i] = temp;
        }
        return new String(tab);


    }

}

