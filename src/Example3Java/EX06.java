package Example3Java;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        System.out.print("Enter Text : ");
        String str = new Scanner(System.in).nextLine();
        int num = 0;
        int index = str.indexOf("f");
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'F' || str.charAt(i) == 'f')
                num += 1;
        System.out.println("Text : "+str+" , sum 'F' and 'f' = "+num);
    }
}
