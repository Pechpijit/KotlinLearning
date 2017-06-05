package Example3Java;

public class EX23 {
    public static void main(String[] args) {
        int[][] x = new int[2][2];
        x[0][0] = x[0][1] = x[1][0] = x[1][1] = 1;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        System.out.println("sum Array x = " + sum);
    }
}
