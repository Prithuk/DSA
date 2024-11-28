package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Prtih");
        map.put(2, "kathet");
        map.put(3, "a");
        map.put(4, "b");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.values());
        System.out.println(map.keySet());

        //iterating map
        for (Map.Entry<Integer, String> data : map.entrySet()) {
            System.out.println(data.getKey() + ":" + data.getValue());
        }
        
    }
}
