package tutorial.collections;

import java.util.*;

public class List_Set {
    public static final String FINISH_LIST = "-";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<String>();
        String name;
        do {
            System.out.println("Write name:");
            name = sc.next();
            if (!name.equals(FINISH_LIST)) {
                names.add(name);
            }
        } while (!name.equals(FINISH_LIST));

        uniqueNames.addAll(names);
        System.out.println("You wrote: " + uniqueNames.size() + "unique names");
    }
}



