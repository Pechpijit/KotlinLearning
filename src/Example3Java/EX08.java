package Example3Java;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] strShow = str.split(" ");
        String show = "";
        for (int i = 0; i < strShow.length; i++)
            show += strShow[i];

        System.out.println("String : " + show);
    }
}
