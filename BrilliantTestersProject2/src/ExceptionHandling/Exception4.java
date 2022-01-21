package ExceptionHandling;

import java.io.IOException;

/**
 * Created by User on 16/01/2016.
 */
public class Exception4 {
    void myMethod() throws IOException {
        throw new IOException();//checked exception
//        throw new RuntimeException();//not needed for Unchecked exception
    }

    void anotheMethod() throws IOException {
        myMethod();
    }
    void newMethod() throws IOException{

        anotheMethod();

    }
    public static void main(String args[]){
        Exception4 obj=new Exception4();
        try {
            obj.newMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("normal flow...");
    }
}
