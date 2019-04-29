public class CallClassOrMethod1 {
    public static void main(String[] args) {
        add(10,20);
        sub(20,10);
        MethosdP1.addition(5,5,5);//methods from other class
        //calling without creating object
        //by class name
        MethosdP2.subtraction(5,5,10);

    }
    private static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
}
