package javaconcepts;

/**
 * Created by User on 05/10/2017.
 */
public class Poly4 extends Poly3 {
    int age = 45;
    public static void main(String args[]) {
        Poly3 p3;
        Poly4 p4;

        p3 = new Poly4(); // upcasting
        p4 = new Poly4();
//        p4 = new Poly3(); // ot possible

        System.out.println(p3.age);
        System.out.println(p4.age);
    }
}
