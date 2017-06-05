package Example3Java;

import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        System.out.println("Enter row : ");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Enter colum : ");
        int colum = new Scanner(System.in).nextInt();

        int[][] x = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter Array : ");
                x[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }
}
