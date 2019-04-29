package oops2;

public class WhileLoop1 {
    public static void main(String[] args) {
        WhileLoop1 wl = new WhileLoop1();
        wl.printValues(20,50);
//        System.out.println("continue");
    }


    public void printValues(int start, int end) {
        int a = start;
        while (a <=end) {
            System.out.print(a+" ");
            a++;
        }
    }
}
