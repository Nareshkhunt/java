package Exercise1;

public class Poly1 {
    public void m1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void m1(float a, String str1) {
        String c = a + str1;
        System.out.println(c);
    }

    public void m1(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Poly1 ob=new Poly1();
        ob.m1(12,2);
        ob.m1(3.45f,"naresh");
        ob.m1(5,5,5);
    }

}

