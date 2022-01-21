package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class LogicalOperatorsWithIfElse {
// a, b ,c
    public static void compare(int a, int b, int c){

        if(a>b && a>c){
            System.out.println(a+" is greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest number");
        }
        else {
            System.out.println(c+" is greatest number");
        }

    }

    public static void main(String[] args) {
        compare(10,20,30);
        compare(345,5687,9678);
    }
}
