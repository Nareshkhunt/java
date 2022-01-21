package ExceptionHandling;

public class ExceptionHandling1 {
    public static void main(String args[]){
         try{
             int data=25/0;
             System.out.println(data);
             }
         catch(ArithmeticException e){
                //  e.printStackTrace();
                  System.out.println(e);
                  System.out.println("25 can not divided by zer0");
              }

         finally
         {
             System.out.println("finally block is always executed");
         }
          System.out.println("rest of the code...");
        }

}
