package Example3Java;

public class EX24 {
    public static void main(String[] args) {
        int[][] n = new int[2][2];
        n[0][0] = n[0][1] = n[1][0] = 1;
        n[1][1] = 2;
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] > max) max = n[i][j];
            }
        }
        System.out.println("Array n max : " + max);
    }
}
