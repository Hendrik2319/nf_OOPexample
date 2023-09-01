package org.example.mapsandsets;

import java.util.HashMap;
import java.util.Map;

public class CountStrings {

    public static void main(String[] args) {
        Map<String, Integer> counts = countString(new String[]{"Alice", "Alice", "Bob", "Susan", "Alice"});
        System.out.println(counts);
    }

    private static Map<String,Integer> countString(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : strs) {
            Integer n = map.get(str);
            map.put( str, n==null ? 1 : n+1 );
        }

        return map;
    }
}
