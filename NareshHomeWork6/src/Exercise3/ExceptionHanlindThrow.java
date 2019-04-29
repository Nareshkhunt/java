package Exercise3;

import java.io.IOException;

public class ExceptionHanlindThrow {
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
        ExceptionHanlindThrow obj=new ExceptionHanlindThrow();
        try {
            obj.newMethod();
            obj.myMethod();
            obj.anotheMethod();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("normal flow...");
    }
}
