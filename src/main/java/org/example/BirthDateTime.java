package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yearPro = SafeInput.getRangedInt(in, "Enter the year of your birth:", 1950, 2015);
        int monthPro = SafeInput.getRangedInt(in, "Enter the month of your birth:", 1, 12);
        int dayPro = 0;

        switch (monthPro) {
            case 2: // February
                dayPro = SafeInput.getRangedInt(in, "Enter the day of your birth (1-29):", 1, 29);
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                dayPro = SafeInput.getRangedInt(in, "Enter the day of your birth (1-30):", 1, 30);
                break;
            default:
                dayPro = SafeInput.getRangedInt(in, "Enter the day of your birth (1-31):", 1, 31);
        }
        int hourPro = SafeInput.getRangedInt(in, "Enter the hours of your birth:", 1, 24);
        int minutesPro = SafeInput.getRangedInt(in, "Enter the minutes of your birth:", 1, 59);

        System.out.println("Your date of birth is: " + monthPro + "/" + dayPro + "/" + yearPro);
        System.out.println("Your time of birth is: " + hourPro + ":" + minutesPro);
    }
}
