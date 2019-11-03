package tutorial.loops;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String word = createAWord();
        System.out.println(isPalindrom(word));

    }

    private static String createAWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write word");
        String word = sc.nextLine();
        System.out.println("Word is " + word);
        return word;
    }

    public static boolean isPalindrom(String word) {
        char[] tab = word.toCharArray();
        int length = tab.length;

        for (int i = 0; i <= length / 2; i++) {
            if (tab[i] != tab[(length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}




