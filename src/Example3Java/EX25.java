package Example3Java;

import java.util.Arrays;

public class EX25 {
    public static void main(String[] args) {
        int[][] n = new int[2][2];
        n[0][0] = n[0][1] = n[1][0] = 1;
        n[1][1] = 2;
        int[] x = new int[4];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                x[index] = n[i][j];
                index += 1;
            }
        }
        System.out.println("Array x : " + Arrays.toString(x));
    }
}
