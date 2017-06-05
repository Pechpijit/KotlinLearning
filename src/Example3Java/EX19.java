package Example3Java;

import java.util.Arrays;
import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        System.out.print("Enter x : ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Enter y : ");
        int y = new Scanner(System.in).nextInt();
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] snum = new int[y - x + 1];
        int index = 0;
        for (int i = x; i < y + 1; i++) {
            snum[index] = num[i];
            index++;
        }
        System.out.println("Array num : " + Arrays.toString(num));
        System.out.println(Arrays.toString(snum));
    }
}
