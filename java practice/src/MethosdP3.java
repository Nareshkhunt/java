public class MethosdP3 {
    public void divi(int a,int b){
        float c=a/b;
        System.out.println(c);
    }
    public void calc2(int a,float b,double c){
        double d=(a/b)*c+a+b-a;
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethosdP3 o=new MethosdP3();
        o.divi(100,50);
        o.calc2(5,10.5f,20.55);
        /* two instance methos (divi,calc2) calling
        in main methos by object creation in the same
        class
         */
    }
}
