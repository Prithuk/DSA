package com.internqns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vanityCode {

    public static void main(String[] args) {


        Map<Integer, List<String>> vMap = new HashMap<>();

        vMap.put(2, Arrays.asList("a","b","c"));
        vMap.put(3, Arrays.asList("d","e","f"));
        vMap.put(4, Arrays.asList("g","h","i"));
        vMap.put(5, Arrays.asList("j","k","l"));
        vMap.put(6, Arrays.asList("m","n","o"));
        vMap.put(7, Arrays.asList("p","q","r","s"));
        vMap.put(8, Arrays.asList("t","u","v"));
        vMap.put(2, Arrays.asList("w","x","y","z"));

        System.out.println(vMap);

    }
}
