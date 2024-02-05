package com.Java.MapExample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new LinkedHashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 90);

        System.out.println("LinkedHashMap Key Example:");
        Set<String> keySet = studentScores.keySet();
        System.out.println(keySet);
        
        System.out.println("LinkedHashMap Value Example:");
        Collection<Integer> values = studentScores.values();
        System.out.println(values);
        
        System.out.println("LinkedHashMap Entry Example:");
        Set<Entry<String, Integer>> entrySet = studentScores.entrySet();
        System.out.println(entrySet);
        
        System.out.println("LinkedHashMap Example:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
