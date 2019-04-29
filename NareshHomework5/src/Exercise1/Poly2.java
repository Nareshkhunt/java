package Exercise1;

public class Poly2 extends Poly1 {
    public void m1(int a, int b) {
        int c = a + b;
        System.out.println("my addition in m1 methos:" + c);
    }

    public void m1(float a, String str1) {
        String c = a + str1;
        System.out.println("my addition of float and string:" + c);
    }

    public void m1(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("addition of three integer:" + d);
    }

    public static void main(String[] args) {
        Poly1 p1;//parent class variable
        p1=new Poly1();//parent class object
        Poly2 p2;
        p2=new Poly2();//child class object
        p1=new Poly2();//child class object can be stored in the parent class reference variable
      //  p2=new Poly1()//downcasting
        //parent class object cant stored in child class ref variables
        p1.m1(5,5);
        p2.m1(5,5);
        p1.m1(5,"parita");
        p2.m1(5,"parita");
        p1.m1(5,5,5);
        p2.m1(5,5,5);

    }
}