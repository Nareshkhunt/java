package ExceptionHandling;

import java.util.Scanner;

/**
 * Created by User on 16/01/2016.
 */
public class Exception1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try{
            int scannedValue= scanner.nextInt();
            int a[]=new int[5];
            a[5]=30/scannedValue;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("Arithmetic exception is handled");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException  is handled");
        }
        catch(Exception e){
            System.out.println("All other exceptions are handled");
        }
 finally {
            System.out.println("I am in final block");
        }

//        System.out.println("rest of the code...");
//        System.out.println("rest of the code...");
//        System.out.println("rest of the code...");
//        System.out.println("rest of the code...");
//        System.out.println("rest of the code...");
//        System.out.println("rest of the code...");
    }
}
