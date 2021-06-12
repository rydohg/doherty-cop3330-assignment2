package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name:  ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter the employee ID:  ");
        String employeeId = scanner.nextLine();
        scanner.close();

        System.out.print(validateInput(firstName, lastName, zipCode, employeeId));
    }

    public static String validateInput(String firstName, String lastName, String zipCode, String employeeId){
        String printString = "";
        printString += nameVerify(firstName, "first");
        printString += nameVerify(lastName, "last");
        printString += zipVerify(zipCode);
        printString += employeeVerify(employeeId);
        if (printString.equals("")) {
            printString = "There were no errors found.\n";
        }
        return printString;
    }

    public static String employeeVerify(String employeeId) {
        Pattern idPattern = Pattern.compile("AA-[0-9][0-9][0-9][0-9][0-9]\\b");
        Matcher matcher = idPattern.matcher(employeeId);
        return matcher.matches() ? "" : "The employee ID must be in the format of AA-1234.\n";
    }

    public static String nameVerify(String name, String title){
        String returnString = (name.length() >= 2) ? "" : "The " + title + " name needs to be at least 2 characters long\n";
        if (name.equals("")){
            returnString += "The " + title + " name needs to be filled in\n";
        }
        return returnString;
    }

    public static String zipVerify(String zipCode){
        try {
            Integer.parseInt(zipCode);
            return "";
        } catch (Exception e){
            return "The zipcode should be a 5-digit number\n";
        }
    }
}
