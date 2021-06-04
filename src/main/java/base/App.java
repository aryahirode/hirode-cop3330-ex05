/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        myApp.output(myApp.num1Prompt(), myApp.num2Prompt());
    }

    private String num1Prompt() {
        System.out.print("What is the first number? ");
        return in.nextLine();
    }

    private String num2Prompt() {
        System.out.print("What is the second number? ");
        return in.nextLine();
    }

    private int[] calculations() {
        int num1 = Integer.parseInt(num1Prompt());
        int num2 = Integer.parseInt(num2Prompt());
        return new int[]{num1 + num2, num1 - num2, num1 * num2, num1 / num2};
    }

    private void output(String num1, String num2) {
        System.out.printf("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d\n", num1, num2, calculations()[0], num1, num2, calculations()[1], num1, num2, calculations()[2], num1, num2, calculations()[3]);
    }
}
