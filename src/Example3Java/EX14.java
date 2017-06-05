package Example3Java;

public class EX14 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int odd = 0, even = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                odd += 1;
            } else {
                even += 1;
            }
        }
        System.out.println("number odd : " + odd + " number even : " + even);
    }
}
