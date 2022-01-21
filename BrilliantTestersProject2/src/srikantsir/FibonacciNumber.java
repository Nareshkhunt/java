package srikantsir;
/*The Fibonacci Sequence is the series of numbers:
 0,1,1, 2, 3, 5, 8, 13, 21, 34, ...
  The next number is found by adding up the two numbers before it.
   The 2 is found by adding the two numbers before it (1+1)
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber ob=new FibonacciNumber();
        ob.fiboSerise(1,10);

    }
    public void fiboSerise(int from, int to){
        int a=0,b=1;// fist two no we take o,1
        System.out.println("\nThe Fibonacci series are for number 1 to 10:");
        System.out.print(a+" "+b);
        int c;
        for (int i = from; i<=to ; i++) {
            c=a+b;
            System.out.print(" "+c);//no will swapp every time in for loop
            a=b;//b value will be a and c will be b
            b=c;
        }
    }

}
