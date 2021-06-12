package ex31;

import java.util.Scanner;

public class KarvonenHeart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 0;
        int age = 0;
        boolean incorrectInput = true;
        while (incorrectInput){
            try {
                System.out.print("Enter resting heart rate: ");
                rate = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter age: ");
                age = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                continue;
            }
            incorrectInput = false;
        }
        System.out.println("Intensity | Rate ");
        for (int i = 55; i <= 95; i += 5) {
            int karvonenRate = (int) Math.round((((220 - age) - rate) * i / 100.0) + rate);
            System.out.println(i + "%       | " + karvonenRate + " bpm");
        }
    }
}
