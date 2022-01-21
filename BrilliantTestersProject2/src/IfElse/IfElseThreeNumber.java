package IfElse;

public class IfElseThreeNumber {
    public static void main(String[] args) {
        int num1=5,num2=6,num3=7,min;
        if(num1<num2)
            if (num1<num3)
                min=num1;
            else
                min=num3;
        else
        if(num2<num3)
            min=num2;
        else
            min=num3;
        System.out.println("Minimum value="+min);
    }

}
