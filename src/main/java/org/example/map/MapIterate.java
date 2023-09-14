package org.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {

    public static void main(String[] args) {
        Map<String,String> myMap = new HashMap<>();

        myMap.put("key1","Java");
        myMap.put("key2","Python");
        myMap.put("key3","Golang");
        myMap.put("key4","JavaScript");

        // 1st way

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()){
            String key = it1.next();
            System.out.println("key="+key + " value="+ myMap.get(key));
        }

        System.out.println("------------------");
        // 2ng way

        Iterator<Map.Entry<String, String>> it2 = myMap.entrySet().iterator();
        while (it2.hasNext()){
            Map.Entry<String, String> entry = it2.next();
            System.out.println("key="+entry.getKey() + " value="+ entry.getValue());
        }

        System.out.println("3rd------------------");
        // 3rd way

        myMap.forEach((k,v)-> System.out.println("key="+k + " Value="+v));

        System.out.println("4th way------------------");
        // 4th way
        for(Map.Entry<String,String> entry: myMap.entrySet()){
            System.out.println("key="+entry.getKey() + " value="+ entry.getValue());
        }

        System.out.println("5th way------------------");
        // 5th way
        for(String key: myMap.keySet()){
            System.out.println("key="+key + " value="+ myMap.get(key));
        }


    }
}
