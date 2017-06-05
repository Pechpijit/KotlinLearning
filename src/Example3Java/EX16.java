package Example3Java;

public class EX16 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] y = new int[x.length * 2];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
    }
}
