public class CallClassOrMethod2 {
    public void addd(int a, int b){
        int c=a+b;
        System.out.println(c);
        /*instance to instance method calling from
        other class by creating object for that calss
        only
         */
        MethosdP3 o=new MethosdP3();
        o.divi(100,50);
    }
    public static void subb(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        subb(10,5);//static to static direct calling
        //instace to static calling by obeject creation
        CallClassOrMethod2 o1=new CallClassOrMethod2();
        o1.addd(10,20);
        /*to call static method from other class
        need class name.method and call always
        in the main method only
        */
        MethosdP1.addition(5,5,5);
        MethosdP2.subtraction(10,2,2);
        CallClassOrMethod1.sub(10,5);
        /*to call any instance method from particular
        class,need to creat object for that class only
         */
        MethosdP3 o2=new MethosdP3();
        o2.divi(200,10);
        o2.calc2(4,2.2f,20.55);



    }
}
