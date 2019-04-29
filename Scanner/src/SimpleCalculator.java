import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of first number:");
        int a=scan.nextInt();
        System.out.print("Enter value of Second number:");
        int b=scan.nextInt();
        System.out.print("Enter  + for Addition, - for Subtraction, * for Multiplication, / for Division :");
        String x=scan.next();
        int c;
        double d;
        if (x.equals("+"))
        {
            c=a+b;
            System.out.println("\n The Addition of Two number is\t: "+c);
        }else if (x.equals("-"))
        {
            c=a-b;
            System.out.println("\n The Subtraction of Two number is\t: "+c);
        }else if (x.equals("*"))
        {
            c = a*b;
            System.out.println("\n The Multiplication of Two number is\t: "+c);
        }else if (x.equals("/"))
        {
            double y=a,z=b;
            d=y/z;
            System.out.println("\n The Division of Two number is\t: "+d);
        }else
        {
            System.out.println("\n Invalid input Symbol");
        }
    }
}
