package methodsPractice;

/**
 * Created by User on 27/11/2016.
 */
public class MethodOne {
    static int num1=10, num2=18;

    public static void main(String[] args) {
        addition();
        addition();

        additionTwo(8989,343);
        additionTwo(454,7878);
        additionTwo(2324,787);

//        float result1 = additionThree(435,56);
//        float result2 = additionThree(43565,56);
//        float result3 = additionThree(435,8856);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);

        additionOf4Nos(12.0f,45);
        additionOf4Nos(12,45);
        MethodOne m1= new MethodOne();

    }

//    public float additionThree(int num1, int num2) {
//        float num3=num1+num2;
//        return num3;
//    }
    public static void additionOf4Nos(float num1, int num2) {
        float num3=num1+num2;
        System.out.println("Addition of num1 and num2 = " + num3);
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
