package tutorial.collections;

import java.util.*;

public class List_Set2 {
    public static final String THE_END = "-";

    public static void main(String[] args) {
        Set<String> setNames = new HashSet<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Write names / if you write'-' the program will end");

        String name;
        while (!((name = sc.nextLine()).equals(List_Set2.THE_END))) {
            setNames.add(name);
        }
        for (String setName : setNames) {
            System.out.println(setName);
        }
    }

}
