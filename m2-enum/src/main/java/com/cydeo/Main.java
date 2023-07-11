package com.cydeo;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        MyFriends c = MyFriends.ZIYA;

        System.out.println(MyFriendsDemo.YUSUF);

        System.out.println(c);
        System.out.println(MyFriends.ZIYA);


        System.out.println("How to get all constant");
        MyFriends[] currencies = MyFriends.values();

        for (MyFriends currency : currencies) {
            System.out.println(currency);

        }


        System.out.println("*------------------------------------*");
        System.out.println("How to use enums in switch case");

        Random myRandom = new Random();
//        System.out.println("myRandom = " + myRandom.nextInt(4));
        MyFriends[] myfriends = MyFriends.values();
//        System.out.println(Arrays.toString(myfriends));

        switch(myfriends[myRandom.nextInt(4)]){
            case ZIYA:
                System.out.println("this is ZIYA");
                break;
            case ERKIN:
                System.out.println("this is ERKIN");
                break;
            case YUSUF:
                System.out.println("this is YUSUF");
                break;
            case MUHAMMED:
                System.out.println("this is MUHAMMED");
        }


        System.out.println("*---------------print the job status-----------------*");

        JobStatus[] myJobStatus = JobStatus.values();
        System.out.println(myJobStatus[myRandom.nextInt(4)].getValue());

        System.out.println("*--------------- operation task -----------------*");

        Operations[] operationsList = Operations.values();
        operation(12,4,operationsList);


    }

    public static void operation(int x, int y, Operations[] operation){
        Random my_random = new Random();
        int index = my_random.nextInt(4);
        int result;
        char operationSymbol =operation[index].getOperationSymbol();
        if (operationSymbol == '-') {
            result = x - y;
        }else if(operationSymbol == '+'){
            result = x + y;
        }else if(operationSymbol == '*'){
        result = x * y;
        }else result = x/y;

        System.out.println("operation is " + operation[index]);
        System.out.println(result);
    }

}
