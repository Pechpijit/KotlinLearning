package Example3Java;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        String number = new Scanner(System.in).nextLine();
        String str1 = number.substring(0, 2);
        String str2 = number.substring(9);
        System.out.println("year = " + str1 + ", No." + str2);
    }
}
