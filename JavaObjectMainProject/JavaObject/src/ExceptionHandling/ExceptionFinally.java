package ExceptionHandling;

public class ExceptionFinally {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I am im in catch block");
        }
        finally {
            System.out.println("I am in finally block");
        }

        System.out.println("rest of the code...");
    }
}
