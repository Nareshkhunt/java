package ConstructorMethod;

/**
 * Created by User on 06/08/2017.
 */
public class Sri {
    int a, b;
    float x;
    double y;
    char c;
    boolean status;
    String name;

    public Sri() {
        a=10;
        b=20;
        y=23.43;
        c='Y';
        status=true;
        name="Srikanth";
        System.out.println("I am in constructor");
    }

    public static void main(String[] args) {
        Sri s1=new Sri();
//        System.out.println(s1.a);
//        System.out.println(s1.y);
//        System.out.println(s1.c);
//        System.out.println(s1.status);
//        System.out.println(s1.name);
    }
}
