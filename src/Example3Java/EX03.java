package Example3Java;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        String number = new Scanner(System.in).nextLine();
        String str = number.substring(0, number.indexOf("."));
        String str2 = number.substring(number.indexOf("."), number.indexOf(".") + 3);
        System.out.println("number : " + str + str2);
    }
}
