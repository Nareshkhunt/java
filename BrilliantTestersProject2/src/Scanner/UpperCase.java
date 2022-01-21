package Scanner;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args)
    {
        String changeCase = "";
        Scanner in = new Scanner(System.in);
        System.out.println( "\nEnter the an Alphabet in Upper case: ");
        changeCase = in.nextLine();
        String result;
        result =changeCase.toLowerCase();
        System.out.println(result);

    }
}
