package week7_hw;
/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)

 */

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Second Number : ");
        int second = input.nextInt();

        input.nextLine();

        System.out.println("Enter a symbol from +, - , /, * ");
        char character = input.next().charAt(0);

        if (character == '+') {
            System.out.println(first + second);

        }
        if (character == '-') {
            System.out.println(first - second);
        }
        if (character == '/') {
            System.out.println(first / second);
        }
        if (character == '*') {
            System.out.println(first * second);
        }
    }
}