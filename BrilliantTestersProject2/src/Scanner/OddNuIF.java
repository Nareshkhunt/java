package Scanner;

import java.util.Scanner;

public class OddNuIF {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("\nPlease enter number:");
        int a=in.nextInt();

        if (a< 0)
        {
            System.out.println("invalid input");

        }else if(a % 2 ==0)
        {
            System.out.println("Number is even");
        }else
        {
            System.out.println("Number is odd");
        }
    }
}
