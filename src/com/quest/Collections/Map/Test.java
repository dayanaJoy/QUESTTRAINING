package com.quest.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
        TreeMap<Integer,String> t = new TreeMap<>();
        LinkedHashMap<Integer,String> l = new LinkedHashMap<>();

        h.put(1,"a");
        h.put(2,"b");
        h.put(4,"d");
        h.put(3,"c");

        t.put(5,"e");
        t.put(7,"g");
        t.put(6,"f");
        t.put(8,"h");

        h.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
        System.out.println();
        t.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

        System.out.println("\n2nd\n");
        HashMap<String,String> h2 = new HashMap<>();
        TreeMap<String,String> t2 = new TreeMap<>();
        h2.put("a","A");
        h2.put("c","C");
        h2.put("b","B");
        h2.put("d","D");
        h2.put(null,null);
        h2.put(null,null);
        h2.put(null,"E");

        t2.put("a","A");
        t2.put("c","C");
        t2.put("b","B");
        t2.put("d",null);//accept
        //t2.put(null,null); // not accept

        h2.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
        System.out.println();
        t2.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

        System.out.println();
        l.put(1,"a");
        l.put(2,"b");
        l.put(4,"d");
        l.put(3,"c");
        l.put(null,null);
        l.put(null,null);
        l.put(5,null);
        l.put(6,null);

        l.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
    }
}
