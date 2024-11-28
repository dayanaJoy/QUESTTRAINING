package com.quest.Collections.Map;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(2,"Banana");
        hashmap.put(1,"Orange");
        hashmap.put(3,"Apple");
        hashmap.put(4,"Watermelon");
        hashmap.put(5,"Mango");
        hashmap.put(6,"Pineapple");
        for (String s : hashmap.values()){
            System.out.println(s);
        }
        for (Integer i : hashmap.keySet()){
            System.out.println(i);
        }
        System.out.println(hashmap.put(5,"Grape"));
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println(hashmap.get(1));//get value for the key
        System.out.println(hashmap.get("Mango"));//print null .doesn't support value

        System.out.println(hashmap.remove(1,"Banana"));//bot key and value can be use seperately

        hashmap.clear();
        System.out.println(hashmap.isEmpty());
    }
}
