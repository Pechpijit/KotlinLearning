package Example3Java;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int x = new Scanner(System.in).nextInt();
        int[] num = {1, 2, 3, 4, 5, 6, 33, 6, 8, 33};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                sum++;
            }
        }
        System.out.println("sum Array x == num : " + sum);
    }
}
