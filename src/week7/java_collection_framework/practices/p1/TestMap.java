package week7.java_collection_framework.practices.p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Smith", 30);
        hashmap.put("Anderson", 31);
        hashmap.put("Lewis", 29);
        hashmap.put("Cook", 29);
        System.out.println("Display entries in HashMap: ");
        System.out.println(hashmap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
