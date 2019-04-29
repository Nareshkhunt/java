package staticKeyword;

/**
 * Created by User on 04/09/2017.
 */
public class StaticDemo1 {
//    public static void main(String[] args) {
//        System.out.println("I am in main method");
//    }

    static  {
        System.out.println("I am in the Static block");
        add();
    }



    public static void add() {
        System.out.println("I am in add method");
    }
}
