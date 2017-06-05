package Example3Java;

public class EX30 {
    public static void main(String[] args) {
        System.out.println("reverseString > love you = " + reverseString("love you"));
    }

    private static String reverseString(String s) {
        String re = "";
        for (int i = s.length() - 1; i >= 0; i--) re += s.charAt(i);
        return re;
    }
}
