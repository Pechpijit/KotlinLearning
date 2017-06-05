package Example3Java;

import java.util.Arrays;

public class EX17 {
    public static void main(String[] args) {
        String[] y = new String[10];
        String[] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String n = "SSRU";
        for (int i = 0; i < y.length; i++)
            y[i] = x[i] + n;
        System.out.println("Array y : " + Arrays.toString(y));
    }
}
