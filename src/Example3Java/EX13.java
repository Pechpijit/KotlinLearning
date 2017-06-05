package Example3Java;

public class EX13 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];
        System.out.println("Sum Array x : " + sum);
    }
}
