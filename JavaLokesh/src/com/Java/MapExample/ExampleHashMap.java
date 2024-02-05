package com.Java.MapExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 90);
        
        System.out.println("HashMap Key Example:");
        Set<String> keySet = studentScores.keySet();
        System.out.println(keySet);
        
        System.out.println("HashMap Value Example:");
        Collection<Integer> values = studentScores.values();
        System.out.println(values);
        
        System.out.println("HashMap Entry Example:");
        Set<Entry<String, Integer>> entrySet = studentScores.entrySet();
        System.out.println(entrySet);

        System.out.println("HashMap Example:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
