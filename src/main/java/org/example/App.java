package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { // <- Start of main method

        weeklyAssignment3b();














    } // End of main method


    //  Weekly assignments below
    public static void weeklyAssignment1() {
        String name = "Hello\nKarmand";
        System.out.println(name);
    }

    public static void weeklyAssignment2() {

        System.out.println("Enter a year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }

    public static void weeklyAssignment3a(){

        int num1 = 25;
        int num2 = 11;
        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + " = " + result);

        num1 = 15;
        num2 = 7;
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + " = " + result);

        num1 = 33;
        num2 = 10;
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + " = " + result);

        num1 = 65;
        num2 = 27;
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + " = " + result);


    }  // Was unsure if exercise 3 wanted user input so i tried doing both.
    public static void weeklyAssignment3b() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = in.nextInt();
        System.out.println("Input number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 % num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }

    public static void weeklyAssignment4() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();
        System.out.print("Input number: ");
        int num2 = in.nextInt();
        System.out.print("Input number: ");
        int num3 = in.nextInt();

        System.out.println("The average of the specified numbers: " + (num1 + num2 + num3) / 3);
    }




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
