package staticKeyword;

/**
 * Created by User on 27/11/2016.
 */
public class Calc1 {
    public void add(int a, int b) {
        int c= a+b;
        System.out.println(c);
    }

    public void sub(int a, int b) {
        int c= a-b;
        System.out.println(c);
    }

    public void testCaseOne() {
//        Calc1 c1 = new Calc1();
//        c1.add(23,34);
//        c1.sub(34,4);

        this.sub(34,34);
        this.add(12, 34);
    }
}
