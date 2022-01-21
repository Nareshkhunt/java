package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class IfElseCondition2 {

    public static void main(String[] args) {
        IfElseCondition2 a2 = new IfElseCondition2();
        a2.compare(23, 45);
        a2.compare(213, 345);
        a2.compare(2213, 1345);
    }

    //    compare two number
    public void compare(int num1, int num2) {
        if (num1 <= num2) {
            System.out.println(num1 + " is min value");
        } else {
            System.out.println(num2 + " is min value");
        }
    }
}
