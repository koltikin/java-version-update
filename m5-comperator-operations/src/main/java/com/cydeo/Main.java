package com.cydeo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,9,45,7,-21,5,8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 :0));
        Collections.sort(list,(Comparator.reverseOrder()));
        System.out.println(list);

        list.sort(((o1, o2) -> o1.compareTo(o2)));
        list.sort((Integer::compareTo));
        System.out.println(list);

        list.sort((o1,o2)-> o1.compareTo(o1));
    }
}
