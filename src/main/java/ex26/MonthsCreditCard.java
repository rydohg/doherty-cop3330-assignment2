package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class MonthsCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your balance? ");
        int balance = scanner.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = scanner.nextInt() / 100.0;
        System.out.print("What is the monthly payment you can make? ");
        int payment = scanner.nextInt();
        scanner.close();

        System.out.print("It will take you " + PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment) + " months to pay off this card.");
    }
}
