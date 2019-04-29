package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class LogicalOperatorsWithIfElse {
    public static void main(String[] args) {
        LogicalOperatorsWithIfElse l1 = new LogicalOperatorsWithIfElse();
        l1.compare2(12,34,56);
        l1.compare2(12,64,56);
        l1.compare2(112,64,56);
        l1.compare2(112,664,56);
    }

    public void compare2(int a, int b, int c) {
        if(a>b && a>c) {
            System.out.println(a+" is greatest number");
        } else if(b>a && b>c) {
            System.out.println(b+" is greatest number");
        } else {
            System.out.println(c+" is greatest number");
        }
    }
}
