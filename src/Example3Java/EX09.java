package Example3Java;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String revers = "",str = new Scanner(System.in).nextLine();
        for (int i = str.length() - 1; i >= 0; i--) revers = revers + str.charAt(i);
        System.out.println((str.equals(revers)? "It is palindrom" : "It is not palindrom"));
    }
}
