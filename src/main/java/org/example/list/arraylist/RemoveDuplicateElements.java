package org.example.list.arraylist;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 5, 6, 8, 7, 8, 9, 2, 3, 4, 5, 8));

        // 1. Using LinkedHashSet
        Set<Integer> distinctNumber = new LinkedHashSet<>(integers);

        List<Integer> integerWithoutDup = new ArrayList<>(distinctNumber);

        System.out.println(integerWithoutDup);

        // 2. Using Java 8 Stream methods
        
        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
