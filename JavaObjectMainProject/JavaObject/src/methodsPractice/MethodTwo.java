package methodsPractice;

/**
 * Created by User on 27/11/2016.
 */
public class MethodTwo {
    static int num1, num2;
    public float additionThree(int num1, int num2) {
        float num3=num1+num2;
        return num3;
    }
    public void additionOf4Nos(float num1, int num2,int num3, int num4) {
        float result=num1+num2+num3+num4;
        System.out.println("Addition of num1 and num2 = " + result);
    }

    public static void addition() {
        int num3=num1+num2;
        System.out.println("Addition of num1 and num2 = " + num3);
    }

    public static void additionTwo(int num1, int num2) {
        int num3=num1+num2;
        System.out.println("Addition of num1 and num2 = "+num3);
    }



    public static void subtraction() {
        int num3=num1+num2;
        System.out.println("Addition of num1 and num2 = "+num3);
    }
}
