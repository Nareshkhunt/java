package Acm1;

public class MyPrivate1 {
    public static void main(String[] args) {
        MyPrivate myPrivate=new MyPrivate();
        myPrivate.add(5,7);
        int myInt=myPrivate.b;
        System.out.println(myPrivate.b);
       /* MyPrivate o=new MyPrivate();
        o.add(4,6);
        MyPrivate.add(5,6);
        */
       //method with private ACM cant accessed outside class or within PKG
    }
}
