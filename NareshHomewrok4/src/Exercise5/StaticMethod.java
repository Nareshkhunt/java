package Exercise5;

public class StaticMethod {
    static int a=5;
    static int b=10;
    static int c=a+b;
    public static void add(){
        System.out.println(c);
    }
    static int d=a-b;
    public void sub(){
        System.out.println(d);
    }
    public static void main(String[] args) {
        add();
        StaticMethod o=new StaticMethod();
        o.sub();

    }
}
