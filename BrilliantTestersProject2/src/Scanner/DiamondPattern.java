package Scanner;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows:");
        int size=sc.nextInt();
        int noOfColumns=1;
        int start=0;
        int noOfSpace=size/2;
        for (int i = 1; i <=size ; i++)
        {
            for (int j = 1; j<=noOfSpace ; j++)
            {
                System.out.print(" ");
            }
            if(i<size/2+1)
            {
                start=i;
                noOfSpace=noOfSpace-1;
            }else
            {
                start=(size+1)-i;
                noOfSpace=noOfSpace+1;
            }
            for (int j=1;j<=noOfColumns;j++)
            {
                int middleColum=noOfColumns/2+1;
                System.out.print("*");

            }
            System.out.println("");
            if (i<size/2+1)
            {
                noOfColumns=noOfColumns+2;
            }else
            {
                noOfColumns=noOfColumns-2;
            }
        }
    }
}
