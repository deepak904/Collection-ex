package org.example.list.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        // hashset internally implements hashmap
        Set<String> hs = new HashSet<>();

        hs.add("java");
        hs.add("python");
        hs.add("c#");
        hs.add("javascript");

        System.out.println(hs);

        // iterating hashset
        for(String s:hs){
            System.out.println(s);
        }

        System.out.println("-----------");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<Integer> hs1 = new HashSet<>(Arrays.asList(new Integer[] {1,2,3,4,4,5,6}));

        System.out.println(hs1);


    }


}
