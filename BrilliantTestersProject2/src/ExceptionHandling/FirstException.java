package ExceptionHandling;

import java.util.Scanner;

/**
 * Created by User on 01/05/2017.
 */
public class FirstException {
   static int firstValue;
   static int secondValue;
    public void div(int a , int b) {
        try {
            float c = a/b;
            System.out.println(a+" divided by "+b+ "="+c);
        }
        catch (Exception e) {
            System.out.println("A no. can not be divided by Zero");

            //----------- OR ------------
//            e.printStackTrace();

            // -------------- OR ------------
//            StackTraceElement[] exc = e.getStackTrace();
//            for (int i = 0; i <= exc.length; i++) {
//                System.out.println(exc[i]);
//            }
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace();
        }
        System.out.println("rest of the code");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

try {
    System.out.println("Please enter first value");
    firstValue = scan.nextInt();
    System.out.println("Please enter second value");
    secondValue = scan.nextInt();
}
catch (Exception e) {
    System.out.println("exception occured");
}
        FirstException fe = new FirstException();
        fe.div(firstValue,secondValue);
    }
}
