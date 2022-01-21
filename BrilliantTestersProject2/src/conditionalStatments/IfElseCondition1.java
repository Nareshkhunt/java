package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class IfElseCondition1 {
    final int MIN_BALANCE = 10;

    public void payg(int myBalance) {

        if(myBalance >= MIN_BALANCE) {
            System.out.println("Gates opened");
        }
        else {
            System.out.println("you do not have enough balance, please top up");
        }
    }


    public static void main(String[] args) {
        IfElseCondition1 ifElseCondition1=new IfElseCondition1();
        ifElseCondition1.payg(8);
        ifElseCondition1.payg(15);
    }
}
