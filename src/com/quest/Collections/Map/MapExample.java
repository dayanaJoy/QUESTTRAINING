package com.quest.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Double,Boolean> hm = new HashMap<>();
        TreeMap<Double,Boolean> tm = new TreeMap<>();
        LinkedHashMap<Double,Boolean> lm = new LinkedHashMap<>();

        hm.put(1.1, true);
        hm.put(3.3, false);
        hm.put(2.2, true);
        hm.put(5.5, false);
        hm.put(4.4, true);
        hm.put(null,null);
        hm.put(null,null);
        hm.put(null,true);
        hm.put(7.7,null);

        tm.put(1.1, true);
        tm.put(3.3, false);
        tm.put(2.2, true);
        tm.put(5.5, false);
        tm.put(4.4, true);
        //tm.put(null,null);
        //tm.put(null,null);
       // tm.put(null,true);
        tm.put(7.7,null);

        lm.put(1.1, true);
        lm.put(3.3, false);
        lm.put(2.2, true);
        lm.put(5.5, false);
        lm.put(4.4, true);
        lm.put(null,null);
        lm.put(null,null);
        lm.put(null,true);
        lm.put(7.7,null);

        hm.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println();
        tm.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println();
        lm.forEach((k,v)-> System.out.println(k+" : "+v));
        System.out.println();

        System.out.println("Float and Character : ");
        HashMap<Float,Character> hm2 = new HashMap<>();
        TreeMap<Float,Character> tm2 = new TreeMap<>();
        LinkedHashMap<Float,Character> lm2 = new LinkedHashMap<>();

        hm2.put(1.1f,'a');
        hm2.put(3.3f,'b');
        hm2.put(2.2f,'c');
        hm2.put(5.5f,'d');
        hm2.put(4.4f,'e');
    }
}
