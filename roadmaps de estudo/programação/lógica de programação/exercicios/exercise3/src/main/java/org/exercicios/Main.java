package org.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 3: Write a program that asks the user to enter their age. If the age is less than 18, print "You are a minor." If the age is 18 or greater but less than 65, print "You are an adult." If the age is 65 or greater, print "You are a senior citizen."

        System.out.println("Write your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age <= 18) {
            System.out.println("You are a minor.");
            return;
        }

        if(age <= 65) {
            System.out.println("You are an adult.");
            return;
        }

        System.out.println("You are a senior citizen.");
    }
}