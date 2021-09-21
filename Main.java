package com.suri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int count = 0;
        Scanner input = new Scanner(System.in);
        //taking a value from user
        System.out.println("Enter 'a' value ( from 1 to 9 numbers) : ");
        a = input.nextInt();
        //printing input value
        System.out.println("input a = " + a);
        //for loop for printing odd numbers
        for (int i = 0; i < 100; i++) {
            //condition for checking odd number or not
            if (i % 2 != 0) {
                count++;
                //printing "output" String once and first odd number
                if (count == 1) {
                    System.out.print("output : ");
                    System.out.print(i);
                    // printing from 2nd odd value
                } else if (count >= 2) {
                    System.out.print(", " + i);
                }
            }
            //breaking loop when a == count
            if (a == count) {
                break;
            }

        }
    }
}

