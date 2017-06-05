package Example3Java;

public class EX27 {
    public static void main(String[] args) {
        int[][] n = new int[2][2];
        n[0][0] = n[0][1] = n[1][0] = 1;
        n[1][1] = 2;
        System.out.println("count Array n[] == 1 : " + count(n, 1));
    }

    private static int count(int[][] a, int b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == b) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
