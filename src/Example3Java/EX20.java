package Example3Java;

import java.util.Arrays;

public class EX20 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};
        int[] ab = new int[a.length + b.length];
        for (int i = 0; i < ab.length; i++)
            ab[i] = (i < a.length) ? a[i] : b[i - a.length];
        System.out.println("Array a + Array b = " + Arrays.toString(ab));
    }
}
