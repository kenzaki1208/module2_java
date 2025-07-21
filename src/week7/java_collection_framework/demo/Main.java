package week7.java_collection_framework.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*HashMap<String, Integer> customer = new HashMap<>();
        customer.put("John", 30);
        customer.put("Jane", 28);
        customer.put("Jack", 32);
        customer.put("Jill", 27);

        Set<String> keys = customer.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", " + customer.get(key));
        }*/

        /*LinkedHashMap<String, Integer> customerMap = new LinkedHashMap<>();
        customerMap.put("John", 30);
        customerMap.put("Jane", 28);
        customerMap.put("Jack", 32);
        customerMap.put("Jill", 27);

        Set<String> keys = customerMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", " + customerMap.get(key));
        }*/

        TreeMap<String, Integer> integerTreeMap = new TreeMap<>();
        integerTreeMap.put("John", 30);
        integerTreeMap.put("Maria", 28);
        integerTreeMap.put("Anderson", 32);
        integerTreeMap.put("Diane", 27);

        Set<String> keys = integerTreeMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", " + integerTreeMap.get(key));
        }
    }
}
