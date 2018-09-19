package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first value");
        String myFirstString = keyboard.next();
        keyboard.nextLine();
        System.out.println("Enter the second value");
        String secondString = keyboard.nextLine();
        System.out.println("First String:" + myFirstString + "\nsecond string" + secondString);
    }


    {
        Scanner randomEntry = new Scanner(System.in);
        String myHolder = randomEntry.nextLine();
        System.out.println(myHolder);
    }
}
