 public class Naresh// class diclaration
{   int a = 10;
     int b = 20;//instance variables
    static int c =30;
    static int d =40;//static variables

    void m1()//instance method
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Naresh.c);
        System.out.println(Naresh.d);
    }
    static void m2()//static method
    {   Naresh n =new Naresh();
        System.out.println(n.a);
        System.out.println(n.b);
        System.out.println(n.c);
        System.out.println(n.d);
    }
    public static void main(String[] args)
    {
        Naresh n =new Naresh();
        n.m1();//instance methos calling
        Naresh.m2();//static method calling
    }
}
