package com.cydeo.streamFinalTasks.Task12345678;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
                );

//        1. Find all transactions in the year 2011 and sort them by value(small to high)

        List<Transaction> transactions2011 = transactions.stream().sorted(Comparator.comparing(Transaction::getValue))
                .filter(transaction -> transaction.getYear()==2011)
                .collect(Collectors.toList());
        System.out.println("transactions2011 = " + transactions2011);

//        2. What are all the unique cities where the traders work?

        List<String> t1 = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(t1);

//        3. Find all traders from Cambridge and sort them by name.
        List<Trader> TradersFromCambridge = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity()=="Cambridge")
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("TradersFromCambridge = " + TradersFromCambridge);

//        4. Return a string of all traders’ names sorted alphabetically.
       String tradersNames =  transactions.stream().map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println("tradersNames = " + tradersNames);

//        5. Are any traders based in Milan?

        boolean areAnyTradersBasedInMilan = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity)
//                .anyMatch(str->str == "Milan");
                .anyMatch(str-> Objects.equals(str, "Milan"));

        System.out.println("areAnyTradersBasedInMilan = " + areAnyTradersBasedInMilan);

//        6. Print the values of all transactions from the traders living in Cambridge.
        
        List<String> valuesOfTransactionsFromCambridge = transactions.stream().filter(transaction -> transaction.getTrader().getCity()=="Cambridge")
                .map(transaction -> transaction.getTrader().getName() + ": "+transaction.getValue())
                .collect(Collectors.toList());
        System.out.println("valuesOfTransactionsFromCambridge = " + valuesOfTransactionsFromCambridge);
        
//        7. What is the highest value of all the transactions?
        
        Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("highestValue.get() = " + highestValue.get());
        
//        8. Find the transaction with the smallest value.

        Optional<Integer> smallestValue = transactions.stream().map(Transaction::getValue)
                .reduce(Integer::min);

        System.out.println("smallestValue.get() = " + smallestValue.get());





    }
}
