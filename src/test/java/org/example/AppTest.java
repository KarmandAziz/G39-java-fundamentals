package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
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

    public static void selectionExample() {

        int age = 63;
        boolean working = age < 64;

        if (working) {
            System.out.println("You are still going strong!");
        }

        if (age > 84) {
            System.out.println("Now you are getting a bit old");
        } else if (age > 64 && age < 84) {
            System.out.println("You are retired");
        } else {
            System.out.println("You should be working");
        }

    }
    public static void calculatorExample(){



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a number");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a operator");
        String operator = scanner.nextLine();


        double result = calculate(1,1,"+");
        System.out.println(result);
    }
}
