package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine().trim();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine().trim();
        scanner.close();

        System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are " + (isAnagram(string1, string2) ? "" : "not " ) + "anagrams");
    }

    public static boolean isAnagram(String string1, String string2){
        if (string1.length() != string2.length()){
            return false;
        }
        int[] string1CharOccurrences = new int[26];
        for (char c: string1.toLowerCase().toCharArray()) {
            string1CharOccurrences[c - 'a'] += 1;
        }
        for(char c : string2.toLowerCase().toCharArray()){
            if(string1CharOccurrences[c - 'a'] == 0){
                return false;
            }
            string1CharOccurrences[c - 'a'] -= 1;
        }
        return true;
    }
}
