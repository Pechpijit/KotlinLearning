package Example3Java;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
}
