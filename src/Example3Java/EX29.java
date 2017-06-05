package Example3Java;

public class EX29 {
    public static void main(String[] args) {
        int[][] n = new int[2][2];
        n[0][0] = n[0][1] = n[1][0] = 1;
        n[1][1] = 2;
        System.out.println("Array n max = " + findMexMember(n));
    }

    private static int findMexMember(int[][] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] > max) max = n[i][j];
            }
        }
        return max;
    }
}
