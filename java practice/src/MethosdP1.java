public class MethosdP1 {
    public static void add(){
        int a = 10;int b = 20;
        int c=a+b;
        System.out.println(c);
    }
    public static void addition(int a,int b, int c
    )
    {int d=a+b+c;
        System.out.println(d);

    }
    public static void multi(int a,float b){
        float c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        add();
        add();
        add();
        add();
        addition(10,20,25);
        addition(30,30,30);
        addition(50,100,150);
        addition(100,200,300);
        multi(10,10.5f);
        multi(20,20.5f);
        multi(30,30.5f);
    }
}
