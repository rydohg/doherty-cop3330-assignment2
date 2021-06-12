package ex28;

import java.util.Scanner;

//TODO: test this
public class AddingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("The total is " + sum);
    }
}
