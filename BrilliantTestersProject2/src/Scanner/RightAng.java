package Scanner;

import java.util.Scanner;

public class RightAng {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput number of row to Draw a Right Angle of @ :");
        int x=sc.nextInt();
        for (int i = 0; i <=x+1 ; i++)
        {
            for (int j =1; j < i; j++)
            {
                System.out.print(" @");
            }
            System.out.println(" ");
        }
    }
}
