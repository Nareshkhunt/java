package Ploymorphism;

/**
 * Created by User on 20/12/2015.
 */
public class Poly1 {
    public void add(int a,int b)
    {
        double c=a+b;
        System.out.println(c);
    }

    public void add(double a,int b)
    {
        double c=a+b;
        System.out.println(c);
    }

    public void add(int a,double b)
    {
        double c=a+b;
        System.out.println(c);
    }


    public void add(int a,int b,int c)
    {
        double d=a+b+c;
        System.out.println(d);

    }

//    public double add(int a,int b,int c)
//    {
//        double d=a+b+c;
//        return d;
//    }

    public static void main(String[] args) {
        Poly1 p1 = new Poly1();
        p1.add(12,23,4);
        p1.add(12.0,45);
        p1.add(12,45);
        p1.add(12,45.5);
    }
}
