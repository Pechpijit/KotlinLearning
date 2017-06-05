package Example3Java;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        String number = new Scanner(System.in).nextLine();
        String phone1 = number.substring(0, 3);
        String phont2 = number.substring(4);
        System.out.println("Phone number : " + phone1 + "-" + phont2);
    }
}
