package Exercise2;

public class TestBank {
    public static void main(String[] args) {
        TestBank1 t1 = new TestBank1();
        TestBank2 t2=new TestBank2();
        TestBank3 t3=new TestBank3();
        t1.openAcount();
        t1.depositMoney();
        t1.withdrawal();
        t2.openAcount();
        t2.depositMoney();
        t2.withdrawal();
        t3.openAcount();
        t3.depositMoney();
        t3.withdrawal();
    }
}