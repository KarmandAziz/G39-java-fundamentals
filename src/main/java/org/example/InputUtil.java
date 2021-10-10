package org.example;

import java.util.Scanner;

public class InputUtil {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String stringFromUser(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();

    }


}
