package IntefaceExample;

public class Test1 extends Test{
    public void m3(){
        System.out.println("this is my m3 method");
    }

    public static void main(String[] args) {
        Test1 ob=new Test1();
        ob.m1();
        ob.m2();
        ob.m3();
        It1 ob1=new Test1();
        ob1.m1();
        ob1.m2();
        ob1.m3();
    }
}
