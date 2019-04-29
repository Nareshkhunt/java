import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput number\t:\t");
        int x=sc.nextInt();
        int sum=0;
        System.out.println("The first natural numbers are :"+x);
        for (int i=1;i<=x;i++)
        {
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("\nThe sum of Natural Number upto "+x+ " limit = "+sum);

    }
}
