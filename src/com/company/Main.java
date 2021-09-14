/*
 *  UCF COP3330 Fall 2021 Exercise 1 Solution
 *  Copyright 2021 Timothy Azinord
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        String num1 = scan.next();
        int num1a = Integer.parseInt(num1);

        System.out.println("What is the second number?");
        String num2 = scan.next();
        int num2a = Integer.parseInt(num2);

        int add = num1a + num2a;

        int sub = num1a - num2a;



        int multi = num2a * num1a;
        int div = num1a / num2a;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + div);


    }
}
