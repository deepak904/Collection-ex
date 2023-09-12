package org.example.list.arraylist;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {
        // 1. How to create synchronized arraylist

        List<String> listStrings = new ArrayList<>();
        listStrings.add("Deepak");
        listStrings.add("Manish");
        listStrings.add("Rakesh");
        List<String> synchronizedList = Collections.synchronizedList(listStrings);

        synchronized (synchronizedList) {
            Iterator<String> it = listStrings.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        // 2. copyOnWriteArrayList - it is a thread safe array list class

        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>(Arrays.asList("A","B","C","D"));
        Iterator<String> it1 = empList.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }


}
