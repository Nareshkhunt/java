package Acm1;

public class MyPublic {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        MyPublic o = new MyPublic();
        o.add(5,5);
    }
}
