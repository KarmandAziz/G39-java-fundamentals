package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) { // <- Start of main method

        weeklyAssignment2();





    } // End of main method


    //Weekly assignments below
    public static void weeklyAssignment1() {
        String name = "Hello\nKarmand";
        System.out.println(name);
    }

    public static void weeklyAssignment2() {

        System.out.println("Enter a year ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = true;

        if (year % 4 == 0) {
            if (year % 400 == 0)
                leap = true;
                System.out.println("This specified year is a leap year!");
            } else {
            if (year % 100 != 0) {
                leap = false;
                System.out.println("The specified year is not a leap year!");
            }
        }


    }

    public static void weeklyAssignment3(){
        int num1 = 45;
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


    }
