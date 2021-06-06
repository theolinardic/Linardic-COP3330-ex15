/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 15 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex15;
import java.util.Scanner;

public class ex15 {
    public static void main( String[] args )
    {

        String correctPassword = "abc$123";

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the user name? ");
        String username = userInputScanner.next();
        System.out.print("What is the password? ");
        String userProvidedPassword = userInputScanner.next();

        if(userProvidedPassword.equals(correctPassword)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
