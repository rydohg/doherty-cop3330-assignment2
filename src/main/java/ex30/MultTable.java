package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */
public class MultTable {
    public static void main(String[] args) {
        System.out.println(makeTable());
    }
    public static String makeTable(){
        StringBuilder printString = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                if (i * j >= 10 && i * j < 100) {
                    printString.append(" ");
                } else if (i * j < 10) {
                    printString.append("  ");
                }
                printString.append(i * j).append(" ");
            }
            printString.append("\n");
        }
        return printString.toString();
    }
}
