package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        
        printDoubled(items);

        System.out.println("* ----------------------------------------------------------- *");

        FootballPlayer ziya = new FootballPlayer("ziya");
        BaseballPlayer seyfullah = new BaseballPlayer("seyfullah");
        SoccerPlayer adil = new SoccerPlayer("adil");

        Team<SoccerPlayer> egle = new Team("egle");

//        egle.addPlayer(ziya);
//        egle.addPlayer(seyfullah);
          System.out.println(egle.addPlayer(adil));
          System.out.println(egle.addPlayer(adil));













    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (int item : items) {
            System.out.println(item*2);
        }

    }
}
