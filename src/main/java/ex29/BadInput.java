package ex29;

import java.util.Scanner;

public class BadInput {
    public static void main(String[] args) {
        boolean incorrectInput = true;
        int rate = 0;
        Scanner scanner = new Scanner(System.in);
        while (incorrectInput){
            System.out.print("Enter the rate of return: ");
            String input = scanner.nextLine();
            try {
                rate = Integer.parseInt(input);
                if (rate == 0){
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Sorry. That is not a valid input.");
                continue;
            }
            incorrectInput = false;
        }
        System.out.println("It will take " + 72 / rate + " years to double your initial investment.");
    }
}
