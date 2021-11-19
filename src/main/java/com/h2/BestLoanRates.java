package com.h2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class BestLoanRates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");


       Map<Integer, Float> bestRates = new HashMap<>();
       bestRates.put(1, 5.5f);
       bestRates.put(2, 3.45f);
       bestRates.put(3, 2.67f);

       for(var i = 0; i < bestRates.size(); i++){
            System.out.println(bestRates.get(i+1));
       }

        System.exit(0);

    }
}
