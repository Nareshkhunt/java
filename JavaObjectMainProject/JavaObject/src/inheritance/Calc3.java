package inheritance;

/**
 * Created by User on 27/11/2016.
 */
public class Calc3 extends Calc2 {
    public static void main(String[] args) {
        Calc1 c1 = new Calc1();
        Calc2 c2 = new Calc2();
        Calc3 c3 = new Calc3();

   }

    public void div(int a, int b) {

        float c=a/b;
        System.out.println(c);
    }
}
