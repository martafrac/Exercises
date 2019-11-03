package tutorial.collections;

import java.util.HashMap;
import java.util.Map;

public class Map_ex3 {
    public static void main(String[] args) {

        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "Tomek");
        sampleMap.put(2, "Kasia");

        Map<Integer, String> otherMap= new HashMap<>();
        otherMap.put(3,"Krzysiek");
        otherMap.put(4,"Franek");

        System.out.println("Iterable by values");
        for(String value : sampleMap.values()){
            System.out.println(value);
        }
        System.out.println("Iterable by key and values");
        for(Integer key : sampleMap.keySet()){
         String value= sampleMap.get(key)   ;
            System.out.println(key+" "+ value);
        }
        System.out.println("Iterable by key and values with -use Entry");

        for(Map.Entry<Integer, String> entery: sampleMap.entrySet()){
            Integer key= entery.getKey();
            String value= entery.getValue();
            System.out.println(key+ value);

        }
    }
}