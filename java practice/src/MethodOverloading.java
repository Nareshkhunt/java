public class MethodOverloading {
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        add(1,1);
        add(1,1,1);
    }
}
