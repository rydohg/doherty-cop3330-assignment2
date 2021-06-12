package ex32;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        System.out.println("Lets play Guess the Number!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = 0;
        if (scanner.hasNextInt()){
            difficulty = Integer.parseInt(scanner.nextLine());
        } else {
            System.out.println("Please enter 1, 2, or 3");
            System.exit(1);
        }

        int number = 0;
        if (difficulty == 1){
            number = (int) (Math.random() * 10);
        } else if (difficulty == 2){
            number = (int) (Math.random() * 100);
        } else if (difficulty == 3){
            number = (int) (Math.random() * 1000);
        } else {
            System.out.println("Not a difficulty");
        }
        System.out.print("I have my number. What's your guess? ");
        int guess = -1;
        int guessCount = 0;
        while (guess != number){
            guessCount++;
            try {
                guess = Integer.parseInt(scanner.nextLine());
                if (guess == number){
                    System.out.print("You got it in " + guessCount + " guesses");
                } else if (guess > number) {
                    System.out.print("Too high. Guess again: ");
                } else {
                    System.out.print("Too low. Guess again: ");
                }
            } catch (Exception e){
                System.out.print("Not a number. Guess again: ");
            }
        }

    }
}
