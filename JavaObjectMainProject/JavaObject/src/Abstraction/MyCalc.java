package Abstraction;

/**
 * Created by User on 09/04/2017.
 */
public class MyCalc extends Calc1 {
// declaring instance variables
    static MyInterface m1; //interface variable
    static Calc1 m2; //abstract class variable
    static MyCalc m3; //class variable

    public void sub(int a, int b) {
        int c = a-b;
        System.out.println(c);
    }

    public void method2() {
        System.out.println("I am in method2");
    }

    public void div(int a, int b) {
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        m1 = new MyCalc(); //interface variable
        m2 = new MyCalc(); //abstract class variable
        m3 = new MyCalc(); //class variable


//        m3. //can access all the methods
//        m2. // can access interface methods and abstract class methods
//        m1.// can access only the interface methods


    }


}
