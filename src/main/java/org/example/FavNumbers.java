package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");
        int favoriteDouble = SafeInput.getInt(in, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
