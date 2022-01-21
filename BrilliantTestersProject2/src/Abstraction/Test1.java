package Abstraction;

public class Test1 extends AbstInterface {
    public void m1(int a,int b){
        System.out.println(a+b);
    }
    public void m2(){
        System.out.println("i am in method m2");
    }
    public void m3(){
        System.out.println("i am in method m3");
    }

    public static void main(String[] args) {
        Test1 ob=new Test1();
        ob.m1(5,5);
        ob.m2();
        ob.m3();
    }
}
