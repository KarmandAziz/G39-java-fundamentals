package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public static void play() {
        int theNumber = ThreadLocalRandom.current().nextInt(1,501);
        int numberOfTries = 0;

        for(;;) {
            int guess = InputUtil.intFromUser( "Guess a number:");
            numberOfTries++;
            String result = evaluateGuess(guess, theNumber);
            System.out.println(result);
            if(result.startsWith("The number ")){
                System.out.println("You guessed " + numberOfTries + " times!");
                break;
            }
        }
    }

    public static String evaluateGuess(int guess, int theNumber) {
        if(guess == theNumber){
            return "The number " + theNumber + " is correct!";
        }
        if(guess < theNumber){
            return "Too low.. try again!";
        }
            return "Too high.. try again!";
    }
}
