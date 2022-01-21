package Scanner;

import java.util.Scanner;

public class ToFindSpecificValueInArry {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value:");
        int x=sc.nextInt();

        int a[]={12,23,14,56,78};

        if(a[0]==x || a[1]==x ||a[2]==x ||a[3]==x ||a[4]==x)
        {
            System.out.println("Value in Array");
        }else
        {
            System.out.println("Value is not in Array");
        }
    }
}
