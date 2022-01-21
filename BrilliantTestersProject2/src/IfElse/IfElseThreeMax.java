package IfElse;

public class IfElseThreeMax {
    public static void main(String[] args) {
        int num1 = 70, num2 = 87, num3 = 100, max;
        if (num1 > num2)
            if (num1 > num3)
                max = num1;
            else
                max = num3;
        else if (num2 > num3)
            max = num2;
        else
            max = num3;
        System.out.println("Maximum value=" + max);
    }
}
