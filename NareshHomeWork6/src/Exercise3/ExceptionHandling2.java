package Exercise3;

public class ExceptionHandling2 {
    public static void main(String[] args){
ExceptionHandling2 ob=new ExceptionHandling2();
           ob.divi(10,5);
           ob.divi(10,0);

    }
    public void divi(int a,int b){
        try {
            float c=a/b;
            int arr[]={20,56,57,90,50};
            arr[7]=7;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("no can not divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
           //e.printStackTrace();
          // System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("exception handled");
        }
    }

}