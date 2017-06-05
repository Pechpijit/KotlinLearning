package Example3Java;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String str = new Scanner(System.in).nextLine();
        String show = "";
        for (int i = 1; i <= str.length(); i++)
            show += str.charAt(str.length() - i);
        System.out.println("Text Reverse : " + show);
    }
}
