package Example3Java;

public class EX26 {
    public static void main(String[] args) {
        System.out.println("fac(6) = " + fae(8));
    }

    private static int fae(int a) {
        int temp = a;
        int sum = a;
        for (int i = 0; i < a - 1; i++) {
            temp--;
            sum *= temp;
        }
        return sum;
    }
}
