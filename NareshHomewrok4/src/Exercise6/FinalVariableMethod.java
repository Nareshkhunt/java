package Exercise6;

public class FinalVariableMethod{
         final int MIN_BAL=12;
    public static void main(String[] args) {
FinalVariableMethod ob=new FinalVariableMethod();
ob.oyster(5);
ob.oyster(10);
ob.oyster(50);
    }
public void oyster(int myBalance){

        if(myBalance>=MIN_BAL){
            System.out.println("open the gate");
        }
        else {
            System.out.println("you do not have enough balance,plz top up");
        }


    }

    }


