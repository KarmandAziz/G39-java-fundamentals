package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static final String INTRO = "Welcome to the guessing game!\nGuess a number between 1-500\nPress S to start!\nPress Q to quit!";
    public static final String GOOD_BYE = "Thanks for playing! Goodbye";

    public static void main(String[] args) { // <- Start of main method

        boolean running = false;                     //Exercise 8 guessing game
        do{
            String answer = InputUtil.stringFromUser(INTRO);
            switch (answer){
                case "S":
                case "s":
                    GuessingGame.play();
                    break;
                case "Q":
                case "q":
                    running = true;
                    break;
                default:
                    System.out.println("Unrecognized input:" +"''" + answer + "''");
            }
        }while(running);
        System.out.println(GOOD_BYE);













    } // End of main method


    //  Weekly assignments below
    public static void weeklyExercise1() {
        String name = "Hello\nKarmand";
        System.out.println(name);
    }

    public static void weeklyExercise2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }  // is 2021 a leapYear?

    public static void weeklyExercise3(){

        int num1 = 25;
        int num2 = 11;
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        num1 = 15;
        num2 = 7;
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        num1 = 33;
        num2 = 10;
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);

        num1 = 65;
        num2 = 27;
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }  // print add/sub/multi/div of two or more numbers.

    public static void weeklyExercise4() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();
        System.out.print("Input number: ");
        int num2 = in.nextInt();
        System.out.print("Input number: ");
        int num3 = in.nextInt();

        System.out.println("The average of the specified numbers: " + (num1 + num2 + num3) / 3);
    }  // Avg of 3 calc

    public static void weeklyExercise5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = in.nextLine();
        String sentence = "Hello" + " " + name;
        System.out.println(sentence);
    }  // ''Hello Username''

    public static void weeklyExercise6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = in.nextInt();
        System.out.println("Input number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 % num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    } // prints userInput calc results

    public static void weeklyExercise7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds ");
        int inputSeconds = scanner.nextInt();
        int second = inputSeconds % 60;
        int minute = inputSeconds / 60;
        int hour = minute / 60;
        minute = minute % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    } // convert seconds into hours:minute:second








      // examples and exercises
    public static void selectionExample() {

        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        boolean working = age < 64;

        if (working) {
            System.out.println("You are still going strong!");
        }
        if (age > 84) {
            System.out.println("Now you are getting a bit old");
        } else if (age > 64 && age < 84) {
            System.out.println("You should be retired retired");
        } else {
            System.out.println("You should be working");
        }

    }
    public static double calculate(double num1, double num2, String operator){
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = 0;
                }
                break;
            default:
                System.out.println("operator" + operator + "is not supported");
        }
        return result;
    }
    public static void calculatorExample(){



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a operator");
        String operator = scanner.nextLine();
        System.out.println("Enter a number");
        double num2 = Double.parseDouble(scanner.nextLine());


        double result = calculate(num1,num2,operator);
        System.out.println(result);
    }


    }
