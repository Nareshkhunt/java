package Acm1;

 public class MyPrivate {
      int b=7;
      static void add(int a,int b){
          int c=a+b;
         System.out.println(c);
     }
     public static void main(String[] args) {
         add(5,50);
         //method with private ACM can be accessed inside class
     }

}
