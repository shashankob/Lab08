package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth:", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth:", 1, 12);
        int day = 0;

        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-29):", 1, 29);
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-30):", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-31):", 1, 31);
        }
        int hours = SafeInput.getRangedInt(in, "Enter the hours of your birth:", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of your birth:", 1, 59);

        System.out.println("Your date of birth is: " + month + "/" + day + "/" + year);
        System.out.println("Your time of birth is: " + hours + ":" + minutes);
    }
}
