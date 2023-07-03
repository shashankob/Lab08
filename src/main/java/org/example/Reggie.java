package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String socialNumber = SafeInput.getRegExString(in, "Enter SSN (###-##-####): ", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter UCincy M number (M######): ", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice (Open(O), Save(S), View(V), Quit(Q)): ", "^[OoSsVvQq]$");

        System.out.println("Your SSN: " + socialNumber);
        System.out.println("Your M number: " + mNumber);
        System.out.println("Your menu choice: " + menuChoice);
    }
}
