package Exercise1;

public class Poly4 extends Poly3 {
    float height=6.5f;

    public static void main(String[] args) {
        Poly3 p3;
        Poly4 p4;
        p4=new Poly4();
        p3=new Poly4();//uocasting-child objcet in father variable
       // p4=new Poly3();downcasting parent object in chils variable
       // p3=new Poly2();not possible
       //  p3=new Poly1();
       // p4=new Poly1();
         //P4=new Poly2();
        System.out.println(p3.height);
        System.out.println(p4.height);
    }
}
