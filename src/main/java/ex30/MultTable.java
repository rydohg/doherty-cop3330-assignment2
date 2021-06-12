package ex30;

public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                if(i*j >= 10 && i*j < 100){
                    System.out.print(" ");
                } else if (i*j < 10){
                    System.out.print("  ");
                }
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
