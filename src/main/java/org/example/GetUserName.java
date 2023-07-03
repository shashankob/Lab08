package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");
        int favoriteDouble = SafeInput.getInt(in, "Enter your favorite double");

        System.out.println("\nYour full name is: " + firstName + " " + lastName);
        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
