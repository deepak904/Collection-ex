package org.example.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare {
    public static void main(String[] args) {

        // 1. sort and then equals
        List<String> l1 = new ArrayList<>(Arrays.asList("A","C","B","E","D"));
        List<String> l2 = new ArrayList<>(Arrays.asList("D","C","B","E","A"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        List<String> l3 = new ArrayList<>(Arrays.asList("A","C","B","E","D","F"));
        Collections.sort(l3);
        System.out.println(l1.equals(l3));

        // 2. find out additional elements
        List<String> l4 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        List<String> l5 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        l4.removeAll(l5);
        System.out.println(l4);

        // 3. find out common elements
        List<String> l6 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        List<String> l7 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        l6.retainAll(l7);
        System.out.println(l6);

    }
}
