package Ploymorphism;

public class MyBank extends Bank {
    public void openAcount() {
        System.out.println("my acount is open acount");
    }

    public void depositMoney() {
        System.out.println("i have deposte deposite money");
    }

    public void transferMoney() {
        System.out.println("i have transfer money");
    }

    public void checkBalance() {
        System.out.println("i have check my balance");
    }

    public static void main(String[] args) {
        MyBank ob=new MyBank();
        ob.openAcount();
        ob.depositMoney();
        ob.transferMoney();
        ob.checkBalance();
        ;

    }
}
