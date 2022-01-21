package IntefaceExample;

public class TestBank1 extends Bank.Barclays {
    public void openAcount() {
        System.out.println("i want to open acount barclays");
    }

    public void depositMoney() {
        System.out.println("i want to deposite money to batclays");
    }

    public void withdrawal() {
        System.out.println("i want to withdraw money to barcalsy");
    }

    public static void main(String[] args) {
        TestBank1 ob=new TestBank1();
        ob.openAcount();
        ob.depositMoney();
        ob.withdrawal();
    }
}



