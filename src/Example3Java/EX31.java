package Example3Java;

public class EX31 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9};
        System.out.println("appendArray : " + appendArray(a, b));
    }

    private static String appendArray(int[] a, int[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) c += a[i];
        for (int i = 0; i < b.length; i++) c += b[i];
        return c;
    }
}
