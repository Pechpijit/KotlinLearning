package Example3Java;

public class EX10 {
    public static void main(String[] args) {
        int[] n = new int[10];
        int index = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                n[index] = i;
                index += 1;
            }
        }
        for (int i = 0; i < n.length; i++)
            System.out.println("Array n[" + i + "] = " + n[i]);
    }
}
