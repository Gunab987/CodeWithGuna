package com.Java.MapExample;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new TreeMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("David", 90);
        studentScores.put("Charlie", 78);
        studentScores.put("Bob", 92);
       
        
        System.out.println("TreeMap Key Example:");
        Set<String> keySet = studentScores.keySet();
        System.out.println(keySet);
        
        System.out.println("TreeMap Value Example:");
        Collection<Integer> values = studentScores.values();
        System.out.println(values);
        
        System.out.println("TreeMap Entry Example:");
        Set<Entry<String, Integer>> entrySet = studentScores.entrySet();
        System.out.println(entrySet);

        System.out.println("TreeMap Example:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
