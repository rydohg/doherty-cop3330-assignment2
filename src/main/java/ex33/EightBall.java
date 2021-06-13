package ex33;

import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {
        System.out.println("What is your question?");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(askQuestion());
    }

    public static String askQuestion(){
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};
        return responses[(int) Math.round(Math.random() * 3)];
    }
}
