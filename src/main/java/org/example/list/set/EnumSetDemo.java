package org.example.list.set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {

    enum lang{
        JAVA,
        PYTHON,
        CSHARP,
        JAVASCRIPT,
        VBNET
    }
    public static void main(String[] args) {

        // create enum set
        EnumSet<lang> e1 = EnumSet.allOf(lang.class);
        System.out.println(e1);

        // create empty enum set
        EnumSet<lang> e2 = EnumSet.noneOf(lang.class);
        System.out.println(e2);

        // create selected enum set
        EnumSet<lang> e3 = EnumSet.range(lang.PYTHON,lang.JAVASCRIPT);
        System.out.println(e3);

        // create enum set using of
        EnumSet<lang> e4 = EnumSet.of(lang.JAVASCRIPT);
        System.out.println(e4);

        // iterate enum set
        Iterator<lang> itr = e1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // remove enum set
        e4.remove(lang.JAVASCRIPT);
        System.out.println(e4);



    }
}
