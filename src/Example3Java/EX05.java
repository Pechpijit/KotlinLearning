package Example3Java;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String str = new Scanner(System.in).nextLine();
        String[] str1 = str.trim().split(" ");
        System.out.println("Text1 : " + str1[0] + " , Text2 : " + str1[str1.length - 1]);
    }
}
