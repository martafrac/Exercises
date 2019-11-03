package tutorial.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_ex1 {

    private static final String THE_END = "-";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> couple = new HashMap<>();
        String key = " ";
        String name = " ";
        System.out.println("Write names of couple, if you write '-' program will end");

        while (!(name.equals(Map_ex1.THE_END))) {
            System.out.println("Write first name: ");
            key = sc.nextLine();
            System.out.println("Write second name");
            name = sc.nextLine();
            couple.put(key, name);
            break;
        }
        System.out.println("Write one name, program will find his partner");
        String choseName = sc.nextLine();
        sc.close();
        for (Map.Entry<String, String> coupleName : couple.entrySet()) {
            String key1 = coupleName.getKey();
            String value = coupleName.getValue();
            if (key1.equals(choseName)) {
                System.out.println(key1 + " her partner is" + value);
            }else if(value.equals(choseName)){
                System.out.println(value+ "her partner is: "+ key);
            }else{
                System.out.println("This person isn't on the list");
            }
        }

    }
}