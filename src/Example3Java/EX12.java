package Example3Java;

import java.util.Arrays;
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String n = new Scanner(System.in).nextLine();
        String[] x = new String[10];
        for (int i = 0; i < x.length; i++) x[i] = n;
        System.out.println("Array x : " + Arrays.toString(x));
    }
}
