package tutorial.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class List_ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        java.util.List<String> listOfwords= new ArrayList<>();

        addWords(sc, listOfwords);
        System.out.println("All words before sort:");
        System.out.println(listOfwords);
        listOfwords.sort((a,b)->b.length()-a.length());
        listOfwords.sort(Comparator.comparingInt(String::length));
        System.out.println("All words after sort for reverse length");
        System.out.println(listOfwords);
    }

    private static void addWords(Scanner sc, java.util.List<String> listOfwords) {
        int counter=4;
        System.out.println("Write four words: ");
        while(counter!=0){
            System.out.println("Write another word");
            String word= sc.next();

            listOfwords.add(word);
            counter--;
        }
    }
}
