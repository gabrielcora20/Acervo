package org.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 4: Write a program that takes a positive integer n as input from the user and prints a right-angled triangle of asterisks with n rows. For example, if n is 4, the output should be:
        //      ```
        //        *
        //        **
        //        ***
        //        ****
        //      ```
        //This exercise involves loops, which we haven't explicitly covered yet, but I believe you can handle it based on your performance so far. If you get stuck, remember you can search online for information about loops in Java (e.g., "Java for loop"). This is a crucial part of learning to program: figuring things out independently.

        System.out.println("Write a positive integer: ");
        int n = new Scanner(System.in).nextInt();

        if(n < 0){
            System.out.println("The integer written is not positive.");
            return;
        }

        String line = "";
        //StringBuilder line = new StringBuilder(); // Use StringBuilder for efficiency

        for(int i = 0; i < n; i++) {
            line = line.concat("*");
            //line.append("*"); // Append to the StringBuilder
            System.out.println(line);
        }
    }
}