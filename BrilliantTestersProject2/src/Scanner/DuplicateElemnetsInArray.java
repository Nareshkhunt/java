package Scanner;

import java.util.Scanner;

public class DuplicateElemnetsInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of Elements you want in array:");
        int num;
        num = s.nextInt();
        int c[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            c[i] = s.nextInt();
        }
        System.out.print("array elements\t:\t");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < c.length; i++)
        {
            for (int j = i + 1; j < c.length; j++)
            {
                if (c[i] == (c[j]))
                {
                    System.out.println(c[j]+" is Duplicate element in array" );
                }
            }
        }
    }
}
