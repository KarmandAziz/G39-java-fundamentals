package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { // <- Start of main method

        calculatorExample();








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
        int num1 = 26;
        int num2 = 11;
        int result1 = num1 + num2;
        int num3 = 12;
        int num4 = 4;
        int result2 = num3 * num4;
        int num5 = 24;
        int num6 = 6;
        int result3 = num5 / num6;
        int num7 = 55;
        int num8 = 12;
        int result4 = num7 - num8;

        System.out.println("45+11="+ result1 + "\n" + "12*4="+ result2 + "\n" +"24/6="+ result3 + "\n" +"55-12="+ result4);

    }

    public static void weeklyAssignment3b(){  //Tryng to figure out assignment 3's meaning. Calculator?

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
