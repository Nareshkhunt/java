package staticKeyword;

/**
 * Created by User on 27/11/2016.
 */
public class Calc2 extends Calc1 {
    public static void main(String[] args) {

        Calc2 c2 = new Calc2();
        c2.add(34,45);
        c2.sub(34,45);
    }


    public void mul(int a, int b) {
        int c= a*b;
        System.out.println(c);
    }

    public void testCaseTwo() {
//        Calc1 calc1 = new Calc1();
//        calc1.sub(23,34);
        super.sub(435,45);
        super.add(324,45);
    }
}
