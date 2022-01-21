package ImportantJavaProgram;

public class FactorialNumber1 {
    public static void main(String[] args) {
        FactorialNumber ob=new FactorialNumber();
        ob.factN(5);
        ob.factN(7);
        ob.factN(-10);
    }
    public void factorial(int n) {
        if (n < 0) {
            System.out.println("negative nomber not allowed");
        } else {
            int result = 1;
            for (int a = 1; a <= n; a++) {
                result = result * a;
            }
            System.out.println("The factorial of " + n + " is " + result);


        }
    }
}