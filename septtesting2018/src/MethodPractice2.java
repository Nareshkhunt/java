public class MethodPractice2 {
    public static void multi(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public static void divi(int a,int b,int c,int d)
    {
        double x = (a/b)+ (c/d);
        System.out.println(x);

    }
    public static void main(String[] args) {
        multi();
        divi(3,5,9,3);
    }
}
