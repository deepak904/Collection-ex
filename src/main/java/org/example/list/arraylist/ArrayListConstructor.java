package org.example.list.arraylist;

import java.util.*;

public class ArrayListConstructor {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,3,2,2,2));

        numbers.ensureCapacity(20);
        numbers.removeIf(s-> s%2!=0);
        System.out.println(numbers);
        System.out.println(numbers.remove(0));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(0,2));
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10,111,21,43,53,62,72,82));
        List<Integer> integers = numbers1.subList(2, 7);

        System.out.println(integers);

    }
}
