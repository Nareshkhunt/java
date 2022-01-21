package ExceptionHandling;

/**
 * Created by User on 16/01/2016.
 */
public class Exception3 {
    static void validate(int age) throws ArithmeticException{
        if(age<18)
            throw new ArithmeticException("You are not Eligible to Vote");
//            System.out.println("invalid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try {
            validate(10);
        }catch (Exception e) {
//            e.printStackTrace();
            System.out.println("You are not eligible to vote");
        }
        System.out.println("rest of the code...");
    }
}
