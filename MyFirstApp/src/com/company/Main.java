package com.company;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	    //Problem 6.Variables
        String name = "Pesho";
        int age = 28;
        double height = 1.84;

        //Problem 7.Print on console
        System.out.println("My name is " + name);

        //Problem 8.Sum two variables and print on console
        int x = 1589;
        int y = 256897;
        int result = x + y;
        System.out.println("The result is " + result);

        //Problem 9.More complex tasks
        //Print on the console the current date
        Date now = new Date();
        System.out.println(now);

        //Print on the console the date after 20 hours
        Date newDate = new Date(now.getTime() + TimeUnit.HOURS.toMillis(20));
        System.out.println(newDate);

        //Print on the console the product of two double variables
        double firstNumber = 1546.50;
        double secondNumber = 547.1;
        double product = firstNumber * secondNumber;
        System.out.println(product);

        //Read from the console an user input which should be numeric.
        //Sum it with 10 and print on the console the sum.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number :");
        int number = in.nextInt();
        int sum = number + 10;
        System.out.println(sum);

        //Read from the console two numbers.
        //Print on the console their product.
        System.out.print("Please enter first number: ");
        int first = in.nextInt();
        System.out.print("Please enter second number: ");
        int second = in.nextInt();
        int productResult = first * second;
        System.out.println(productResult);

        //Print on the console the numbers from 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            if(i % 40 == 0) {
                System.out.println();
            }
        }
    }
}
