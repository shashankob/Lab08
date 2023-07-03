package main.java.org.example;

import org.example.SafeInput;

import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        boolean moreItems = true;
        while (moreItems) {
            double price = SafeInput.getRangedDouble(scanner, "Enter the price of the item:", 0.5, 10.0);
            totalCost += price;

            String confirmInput = SafeInput.getRegExString(scanner, "Do you have more items? (Y/N)", "[YyNn]");
            moreItems = confirmInput.equalsIgnoreCase("Y");
        }

        System.out.printf("Total cost: $ %.2f\n", totalCost);
    }

}
