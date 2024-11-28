package com.quest.Collections.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2,"Banana");
        linkedHashMap.put(1,"Orange");
        linkedHashMap.put(3,"Apple");
        linkedHashMap.put(4,"Watermelon");
        linkedHashMap.put(5,"Mango");
        linkedHashMap.put(6,"Pineapple");
        System.out.println();
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
        for (String value : linkedHashMap.values()) {
            System.out.println(value);
        }
        //both
        System.out.println("\nKey - Value");
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key+" : "+value);
        });
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        //size
        System.out.println("\nSize : "+linkedHashMap.size());
        //get value

        System.out.println("\nValue at 1 : "+linkedHashMap.get(1));
        //remove
        System.out.println("\nRemove element 1 "+linkedHashMap.remove(1));
        System.out.println("\nIsEmpty (before clear) : "+linkedHashMap.isEmpty());
        //clear
        linkedHashMap.clear();
        //is empty
        System.out.println("\nIsEmpty (after clear) : "+linkedHashMap.isEmpty());


    }
}
