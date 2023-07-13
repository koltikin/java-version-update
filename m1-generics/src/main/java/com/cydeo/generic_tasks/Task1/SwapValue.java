package com.cydeo.generic_tasks.Task1;

import java.util.Arrays;

public class SwapValue {

    public static void main(String[] args) {

        String[] b = {"ziya","alim","kadir","yusuf"};
        swap(b,1,3);
        System.out.println(Arrays.toString(b));

        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));

    }

    public static<T> void swap(T[] a, int i,int j){
        T tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

}


/*

                            Question-1

Write a generic method to exchange the positions of two different elements in array.
        Sample output:
        Integer[] a = {1,2,3,4};
        swap(a,0,2); System.out.println(Arrays.toString(a));  //[3,2,1,4]
 */

