package Exercise3;

public class Shape {
    float r;
   final float PI=3.14f;
    double d;
    float a;
    public  void circle(float r){
        float d=2*r;
        System.out.println("diameter:"+d);
    }
    public void circle(float r, double d ){
        double a=PI*(d/2)*r;
        System.out.println("area:"+a);
    }
    public static void main(String[] args) {
        Shape ob=new Shape();
        ob.circle(3.45f);
        ob.circle(3.3f,5.555);
    }
}
