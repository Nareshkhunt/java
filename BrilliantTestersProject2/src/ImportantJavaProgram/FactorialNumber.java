package ImportantJavaProgram;

public class FactorialNumber {
    public static void main(String[] args) {
        FactorialNumber ob = new FactorialNumber();
        ob.factN(6);
        ob.factN(8);
        ob.factN(9);
        ob.factN(-6);

    }

    public void factN(int no) {
        if (no < 0) {
            System.out.println("factorial for negative no is not possible");
        } else {

            int result = 1;
            for (int a = no; a >= 1; a--) {
                result = result * a;
            }
            System.out.println("The factorial of " + no + " is " + result);
        }
    }
}
