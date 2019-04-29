package Exercise3;

import java.util.Scanner;

public class ExceptionHanling3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try{
            int scannedValue= scanner.nextInt();
            int a[]=new int[5];
            a[scannedValue]=30/scannedValue;
            System.out.println(a[scannedValue]);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Arithmetic exception is handled");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException  is handled");
        }
        catch(Exception e){
            System.out.println("All other exceptions are handled");
        }
        finally {
            System.out.println("I am in final block and i will be printed always");
        }

      System.out.println("my rest of the code...");
        System.out.println("my rest of the code...");
        System.out.println("my rest of the code...");
//        System.out.println("my rest of the code...");
//        System.out.println("my rest of the code...");
//        System.out.println("my rest of the code...");
    }
}

