package variables;

public class Dog {

    static String color="Black";
    int weight=566;

    public void eat(){
        System.out.println("Dog can eat");

    }
    public static void bark(){
        System.out.println("Dog can bark");

    }
    public static void run(){

        System.out.println("Dog can run");
    }

    public static void main(String[] args) {
        System.out.println(color);
        System.out.println(Calculator.a);
        Calculator.add1(3,8);
       int c =Calculator.a;
        System.out.println(c);

        Calc1 calc1=new Calc1();
      String myName1  =calc1.myName;
      calc1.add1(2,9);


    }
}
