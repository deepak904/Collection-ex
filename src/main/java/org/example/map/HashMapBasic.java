package org.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    public static void main(String[] args) {

        // no order
        // store key - value pair
        // key can not be duplicate
        // can store multiple null values
        // store only one null key
        // not thread safe / not synchronized

        HashMap<String,String> map = new HashMap<>();
        map.put("India" ,"New Delhi");
        map.put("USA","Washington DC");
        map.put("UK","Londoan");

        map.put(null,"Test");
        map.put(null,"Map");

        map.put("A",null);
        map.put("B",null);

        System.out.println(map.get(null));

        System.out.println(map.get("A"));

        System.out.println(map.get("India"));

        // iterating map using keySet()
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("Key ="+ key + " values ="+ value );
        }

        // iterating map using entrySet()

        System.out.println("------------------------");
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println("Key ="+ entry.getKey() + " values ="+ entry.getValue() );

        }
        System.out.println("------------------------");

        // iterating map using Java 8

        map.forEach((k,v)-> System.out.println("Key ="+ k + " values ="+v));


    }
}
