package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minLength = -1;
        int numSpecialChars = -1;
        int numNumbers = -1;
        try {
            System.out.print("What's the minimum length? ");
            minLength = Integer.parseInt(scanner.nextLine());
            System.out.print("How many special characters? ");
            numSpecialChars = Integer.parseInt(scanner.nextLine());
            System.out.print("How many numbers? ");
            numNumbers = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Please enter numbers");
            System.exit(1);
        }
        System.out.println("Your password is " + generatePass(minLength, numSpecialChars, numNumbers));
    }

    public static String generatePass(int minLength, int numSpecialChars, int numNumbers) {
        char[] letters = new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = Character.toChars('a' + i)[0];
        }
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] symbols = {'#', '$', '!', '%'};
        int numLetters = numSpecialChars + numNumbers;
        int length = numLetters + numLetters;

        if (length < minLength){
            numLetters += minLength - length;
            length = numLetters + numSpecialChars + numNumbers;
        }

        ArrayList<Integer> availableIndices = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            availableIndices.add(i);
        }

        char[] password = new char[length];
        for (int i = 0; i < numSpecialChars; i++) {
            password[getRandomAvailableIndex(availableIndices)] = symbols[(int) (Math.round(Math.random() * (symbols.length - 1)))];
        }

        for (int i = 0; i < numNumbers; i++) {
            password[getRandomAvailableIndex(availableIndices)] = numbers[(int) (Math.round(Math.random() * (numbers.length - 1)))];
        }

        for (int i = 0; i < numLetters; i++) {
            password[getRandomAvailableIndex(availableIndices)] = letters[(int) (Math.round(Math.random() * (letters.length - 1)))];
        }

        return String.valueOf(password);
    }

    private static int getRandomAvailableIndex(ArrayList<Integer> availableIndices) {
        return availableIndices.remove((int) Math.round(Math.random() * (availableIndices.size() - 1)));
    }
}
