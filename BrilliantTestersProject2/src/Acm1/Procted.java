package Acm1;

public class Procted {
    protected void msg(int a,int b){
        int c =a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Procted o=new Procted();
        o.msg(5,5);
        //Proctted ACM can be accsessed withn class
    }
}
