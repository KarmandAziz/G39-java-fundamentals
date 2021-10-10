package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public static void play() {

        int tries;

        for(int i = 0; i=tries, i++) {
            int theNumber = ThreadLocalRandom.current().nextInt(1,501);
            System.out.println("Try again!");

        }
        System.out.println("Play");
    }
}
