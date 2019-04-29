package Exercise2;

public interface Bank {
    float intrest=8.5f;
    void openAcount();
    void depositMoney();
    void withdrawal();

    class Barclays implements Bank
    {
        public void openAcount(){
            System.out.println("i want to open acount");
        }
        public void depositMoney(){
            System.out.println("i want to deposite money");
        }
        public void withdrawal(){
            System.out.println("i want to withdraw money");
        }

    }
     class LloydsBank implements Bank{
        public  void openAcount(){
            System.out.println("lloyds");
        }
        public void depositMoney() {
            System.out.println("lloyds diposte");
        }
        public void withdrawal() {
            System.out.println("withdrwal lloyds");
        }
    }
     class TescoBank implements Bank {

        public  void openAcount(){
            System.out.println("tescobank");
        }
        public void depositMoney() {
            System.out.println("tesco bank deposit");
        }
        public void withdrawal()
        {
            System.out.println("tesco bank withdrawal");
        }


        }

}





