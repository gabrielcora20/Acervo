package org.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 2: Write a program that asks the user to enter two integers and then prints their sum, difference, product, quotient (as a double), and remainder (modulo).  Make sure your output is clearly labeled (e.g., "Sum: 12", "Difference: -2", etc.).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number: ");
        Integer number1 = scanner.nextInt();

        System.out.println("Write other number: ");
        Integer number2 = scanner.nextInt();

        System.out.println(String.format("Sum: %s", (number1 + number2)));
        System.out.println(String.format("Difference: %s", (number1 - number2)));
        System.out.println(String.format("Product: %s", (number1 * number2)));
        System.out.println(String.format("Quotient: %s", (number1.doubleValue() / number2.doubleValue())));
        System.out.println(String.format("Remainder: %s", (number1 % number2)));
    }
}