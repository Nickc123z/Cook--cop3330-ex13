/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;


public class E13 {
    public static void main(String[] args) {

        int p ;
        float r;
        int t;
        int n;

         Scanner sc = new Scanner(System.in);

         System.out.println("What is the principal amount?");
         p = sc.nextInt();

         System.out.println("What is the rate?");
         r = sc.nextFloat();

         System.out.println("What is the number of years?");
         t = sc.nextInt();

         System.out.println("What is the number of times the interest is compounded per year?");
         n = sc.nextInt();

         double a = (double) p * (Math.pow((1 + r/n), n*t));
          System.out.println("$" + p + " invested at " + r +"% for " + t + " years compounded " + n + " times per year is" + " $" + a);

    }
}
