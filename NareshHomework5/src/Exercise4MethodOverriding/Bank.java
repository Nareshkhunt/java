package Exercise4MethodOverriding;

public class Bank {
    public void openAcount() {
        System.out.println("i want to open acount");
    }

    public void depositMoney() {
        System.out.println("i want to deposite money");
    }

    public void transferMoney() {
        System.out.println("i want to transfer money");
    }

    public void checkBalance() {
        System.out.println("i want to check my balance");
    }

    public static void main(String[] args) {
        Bank ob=new Bank();
        ob.openAcount();
        ob.depositMoney();
        ob.transferMoney();
        ob.checkBalance();
    }

}

