package Acm2;

import Acm1.MyPublic;
import variables.Calc1;
import variables.Calculator;

public class MyPublic2 {

    public static void main(String[] args) {
        MyPublic o=new MyPublic();
        o.add(5,5);
        Calculator.add1(4,8);
        System.out.println(Calculator.a);

        Calc1 calc1 =new Calc1();
        calc1.add1(4,8);
        System.out.println(calc1.myName);

    }
}
