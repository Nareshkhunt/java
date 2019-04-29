package javaconcepts;

/**
 * Created by User on 20/12/2015.
 */
public class Poly2 extends Poly1 {
    public void add(int a,int b)
    {
        double c=a+b;
        System.out.println("Addision of "+a+" and "+b+" is: "+c);
    }

    public void add(int a,int b,int c)
    {
        double d=a+b+c;
        System.out.println("Addision of " + a + "," + b + " and "+c+" is: " + d);
    }


    public static void main(String args[]) {
        Poly1 p1;
        p1= new Poly1(); //parent class object
        Poly2 p2;
        p2= new Poly2(); //child class object
//        p1 = new Poly2(); // child class object can be stored in the parent class reference variable
//        p1.add(12,23);
        p2.add(23,34);



//          p3 = new Poly2(); //upcasting
//        Poly2 p4 = new Poly1(); //not possible

//        Poly2 p4 = new Poly1();

//        p1.add(12,345);
//        p1.add(34,456,78);
//        p1.add(34.5,56);
//        p2.add(12,345);
//        p3.add(12,345);
//        p2.add(34,456,78);
//        p2.add(34.5,56);


    }
}
