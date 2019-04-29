public class Test2 implements It3 {
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void m3(){
        System.out.println("m3");
    }
    public void m4(){
        System.out.println("m4");
    }
    public void m5(){
        System.out.println("m5");
    }
    public void m6(){
        System.out.println("m6");
    }
    public void m7(){
        System.out.println("m7");
    }

    public static void main(String[] args) {
        Test2 ob = new Test2();
        ob.m1();
        ob.m2();
        ob.m3();
        ob.m4();
        ob.m5();
        ob.m6();
        ob.m7();
        It1 ob1=new Test2();
        ob1.m1();
        ob1.m2();
        ob1.m3();
        It2 ob2=new Test2();
        ob2.m4();
        ob2.m5();
        It3 ob3=new Test2();
        ob3.m6();
        ob3.m7();
    }
}
