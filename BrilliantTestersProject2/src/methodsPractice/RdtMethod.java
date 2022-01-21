package methodsPractice;

public class RdtMethod {
    public static int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        RdtMethod.add(5,5);
    }
}
