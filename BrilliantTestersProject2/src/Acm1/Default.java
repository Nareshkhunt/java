package Acm1;

import variables.Calculator;

class Default {
     void add(int a, int b){
         //using Default ACM
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Default o=new Default();
        o.add(5,5);
        Calculator.add1(2,9);
    }
}
