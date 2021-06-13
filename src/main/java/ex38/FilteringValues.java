package ex38;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilteringValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String inputString = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            String[] splitString = inputString.split(" ");
            for (String s : splitString) {
                numbers.add(Integer.parseInt(s));
            }
        } catch (Exception e){
            System.out.println("Incorrect input");
            System.exit(1);
        }
        List<Integer> filteredNums = filter(numbers);
        for (int num : filteredNums) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> filter(ArrayList<Integer> numbers) {
        return numbers.stream().filter(num -> num % 2 == 0).toList();
    }
}
