package Scanner;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter value of first number\t:");
        int a=scan.nextInt();
        System.out.print("\nEnter value of second number\t:");
        int b=scan.nextInt();
        System.out.print("Enter  + for Addition, - for Subtraction, * for Multiplication, / for Division \t:");
        String str1=scan.next();//string="+","-","*" and "/"
        int c;
        double d;
        switch (str1) {
            case "+":
                c = a + b;
                System.out.println("\nThe Addition of Two number is\t: " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("\nThe Subtraction of Two number is\t: " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("\nThe Multiplication of Two number is\t: " + c);
                break;
            case "/":
                double y = a, z = b;
                d = y / z;
                System.out.println("\nThe Division of Two number is\t: " + d);
                break;
            default:
                System.out.println("\nInvalid input Symbol");
        }
    }
}
