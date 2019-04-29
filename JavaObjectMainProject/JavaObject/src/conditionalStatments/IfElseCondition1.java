package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class IfElseCondition1 {
    final int MIN_BALANCE = 10;

    public static void main(String[] args) {
      IfElseCondition1 a1 = new IfElseCondition1();
        a1.payg(2);
        a1.payg(20);
        a1.payg(5);
    }

    public void payg(int myBalance) {

        if(myBalance >= MIN_BALANCE) {
            System.out.println("Gates opened");
        }
        else {
            System.out.println("you do not have enough balance, please top up");
        }

    }
}
