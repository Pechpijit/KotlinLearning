package Example3Java;

public class EX21 {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e"};
        String[] b = {"a", "b", "c", "d", "e"};
        System.out.println("Array a == Array b : " + (a.length == b.length));
        if (a.length == b.length)
            for (int i = 0; i < a.length; i++)
                System.out.println("a[" + i + "] == b[" + i + "] : " + (a[i] == b[i]));
    }
}
