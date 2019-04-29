package Exercise3;

import java.util.concurrent.Callable;

public class Calculator {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public  void add(double a,float b){
        double c=a+b;
        System.out.println(c);
    }
    public void add(int a,int b,float c){
        float d=a+b+c;
        System.out.println(d);
    }
    //public int add(int a,int b){
     //   int c=a+b;
      //  System.out.println(c);
     //   return c;}
    public static void main(String[] args) {
        Calculator ob=new Calculator();
        ob.add(5,5);
        ob.add(4.555,5.55f);
        ob.add(5,5,5.55f);

    }
}

