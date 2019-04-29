package Exercise1b;

public class Test extends MyAbstraction {
public void m4(){
    System.out.println("i m in method m4");
}
public void m5(){
    System.out.println("i m in method m5");
}
public void m6(int a,int b){
    int c=a+b;
    System.out.println(c);
    }

    public static void main(String[] args) {
        Test ob=new Test();
        ob.m4();
        ob.m5();
        ob.m6(5,5);
    }
}
