package inheritance;

/**
 * Created by User on 27/11/2016.
 */
public class Calc2 extends Calc1{
    public static void main(String[] args) {

        Calc2 c2 = new Calc2();
        c2.add(34,45);
        c2.sub(34,45);

    }


    public void mul(int a, int b) {
        int c= a*b;
        System.out.println(c);
    }

  }
