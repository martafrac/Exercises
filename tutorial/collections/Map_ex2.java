package tutorial.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_ex2 {
    public static final String FINISH_ADD_NAMES = "-";

    public static void main(String[] args) {
        java.util.Map<String, String> mapOfCouples = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String name1;
        String name2;
        do {
            System.out.println("Write first name: ");
            name1 = sc.next();
            System.out.println("Write second name: ");
            name2 = sc.next();
            if (!(name1.equals(FINISH_ADD_NAMES) || !(name2.equals(FINISH_ADD_NAMES)))) ;
            mapOfCouples.put(name1, name2);
        }
        while (!(name1.equals(FINISH_ADD_NAMES)) || !(name2.equals(FINISH_ADD_NAMES)));

        System.out.println("Write one of names which you wrote and you would like to find his/her couple");
    }
}

