package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStats {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done){
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            if (input.equals("done")){
                done = true;
            } else {
                try {
                    numbers.add(Integer.parseInt(input));
                } catch (Exception e){
                    System.out.println("Please enter a number");
                }
            }
        }

        System.out.print("Numbers: " + numbers.get(0));
        for (int i : numbers.subList(1, numbers.size())) {
            System.out.print(", " + i);
        }

        double average = avg(numbers);
        System.out.printf("\nThe average is %.2f\n", average);
        System.out.println("The max is " + max(numbers));
        System.out.println("The min is " + min(numbers));
        System.out.printf("The standard deviation is %.2f\n",stdDev(numbers, average));
    }

    public static double avg(ArrayList<Integer> numbers){
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static int min(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int number : numbers.subList(1, numbers.size())) {
            if (number < min){
                min = number;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers.subList(1, numbers.size())) {
            if (number > max){
                max = number;
            }
        }
        return max;
    }
    public static double stdDev(ArrayList<Integer> numbers, double mean){
        double variance = 0;
        for (int number : numbers) {
            variance += Math.pow(number - mean, 2);
        }
        variance = variance / numbers.size();
        return Math.sqrt(variance);
    }
}
