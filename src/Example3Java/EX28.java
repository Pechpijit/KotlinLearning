package Example3Java;

public class EX28 {
    public static void main(String[] args) {
        int[][] n = new int[2][2];
        n[0][0] = n[0][1] = n[1][0] = 1;
        n[1][1] = 2;
        System.out.println("sum of Array n = " + sumOfArray(n));
    }

    private static int sumOfArray(int[][] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                sum += n[i][j];
            }
        }
        return sum;
    }
}
