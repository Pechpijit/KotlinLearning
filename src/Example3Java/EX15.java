package Example3Java;

import java.util.Arrays;

public class EX15 {
    public static void main(String[] args) {
        boolean[] y = new boolean[10];
        int[] x = {10, 55, 9, 8, 6, 56, 24, 8, 66, 10};
        for (int i = 0; i < y.length; i++)
            y[i] = (x[i] > 10) ? true : false;
        System.out.println("Array y :" + Arrays.toString(y));
    }
}
