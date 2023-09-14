package org.example.map;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        Integer a =1;
        /*SoftReference<Integer> soft = new SoftReference<>(a);
        a = null;
        System.gc();
        System.out.println(a);*/
        WeakReference<Integer> weak = new WeakReference<>(a);
        a=null;
        System.gc();
        System.out.println(a);

    }
}
