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
        int num1 = myApp.num1Prompt();
        int num2 = myApp.num2Prompt();
        myApp.output(num1, num2);
    }

    private int num1Prompt() {
        System.out.print("What is the first number? ");
        return Integer.parseInt(in.nextLine());
    }

    private int num2Prompt() {
        System.out.print("What is the second number? ");
        return Integer.parseInt(in.nextLine());
    }

    private int[] calculations(int num1, int num2) {
        return new int[]{num1 + num2, num1 - num2, num1 * num2, num1 / num2};
    }

    private void output(int num1, int num2) {
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", num1, num2, calculations(num1, num2)[0], num1, num2, calculations(num1, num2)[1], num1, num2, calculations(num1, num2)[2], num1, num2, calculations(num1, num2)[3]);
    }
}
