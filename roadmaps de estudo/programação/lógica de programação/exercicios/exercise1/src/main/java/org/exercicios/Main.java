package org.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 1: Write a program that asks the user to enter their name and then prints a personalized greeting, like "Hello, [name]!".
        
        System.out.println("Write your name: ");
        String name = new Scanner(System.in).nextLine();

        System.out.println(String.format("Hello, %s", name));
    }
}