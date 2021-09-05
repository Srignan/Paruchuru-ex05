/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package Exercise05;

import java.util.Scanner;

/*
Create an int variable for each number
Input for user to write in numbers
Use the two ints in each of the four basic operations of arithmetic
 */
public class Solution05
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number? ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

    }
}