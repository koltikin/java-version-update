package com.cydeo.generic_tasks;

import java.util.Arrays;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4,5,6,7,8,9);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number  of  odd  integers  =  "  +  count);

        System.out.println("-------------------------------------------");

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4,5,6,7,8);
        int countEven = countIf(l1, new EvenPredicate());
        System.out.println("Number  of  even  integers  =  "  +  countEven);

        System.out.println("-------------------------------------------");

        List<Double> l2 = Arrays.asList(2.5, 6.8, 9.8, 76.0, 35.0);
        int countEvenDouble = countIf(l2, new EvenDoublePredicate());
        System.out.println("Number  of  EvenDouble  integers  =  "  +  countEvenDouble);



    }

    private static <T> int countIf(List<T> ci, UnaryPredicate<T> predicate) {
        int count = 0;
        for (T each : ci) {
            if(predicate.test(each)) {
                ++count;
            }

        }
        return count;
    }

}






/*

Question-2

Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:
public interface UnaryPredicate<T> { public boolean test(T obj);
}
Sample output:
List<Integer> ci = Arrays.asList(1, 2, 3, 4); int count = countIf(ci, new OddPredicate());
System.out.println("Number  of  odd  integers  =  "  +  count);

*/