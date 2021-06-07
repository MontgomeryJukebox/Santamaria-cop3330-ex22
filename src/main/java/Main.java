/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */

import java.util.Scanner;

public class Main {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = in.nextInt();
        System.out.print("Enter the second number:");
        int second = in.nextInt();
        int max = max(first, second);
        System.out.print("Enter the third number:");
        int third = in.nextInt();
        max = max(max, third);
        System.out.printf("The largest number is %d\n", max);

        in.close();
    }
}
