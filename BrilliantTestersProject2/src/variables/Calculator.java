package variables;

public class Calculator {
  public static int a=3;
   public static int b=5;
    static int c=3;
    static int d=5;

    public static void add(){
        int total=a+b+c+d;
        System.out.println(total);

    }
    public static void sub(){
        int total1=b-c;
        System.out.println(total1);
    }
    public static void multi(){
        int myTotal=a*b;
        System.out.println(myTotal);

    }
    public  static void divi(){
        int divTotal=b/d;
        System.out.println(divTotal);

    }

    public static void add1(int a, int b){
        int c=a+b;
        System.out.println(c);

    }

    public static void main(String[] args) {

//        add();
//        sub();
//        multi();
//        divi();
        add1(107,100);


    }

}
