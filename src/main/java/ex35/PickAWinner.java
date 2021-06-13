package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class PickAWinner {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean blank = false;
        while (!blank){
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                blank = true;
            } else {
                players.add(name);
            }
        }
        System.out.println("The winner is..." + pickWinner(players));
    }

    public static String pickWinner(ArrayList<String> players) {
        return players.get((int) Math.round(Math.random() * (players.size() - 1)));
    }
}
