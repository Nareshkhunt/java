public class ParaConstructor {
    int eId;
    String eName;
    int eSal;
    ParaConstructor(int eId,String eName,int eSal){
        this.eId=eId;
        this.eName=eName;
        this.eSal=eSal;
        //this keyword used for convert local variables
    }//to instance varibles to be able to acssed.
    public void sub(){
        System.out.println("Emploree Id:"+eId);
        System.out.println("Employee Name:"+eName);
        System.out.println("Employee Salary;"+eSal);
    }

    public static void main(String[] args) {
        new ParaConstructor(10,"naresh",5000).sub();
        new ParaConstructor(15,"pqrita",6000).sub();
    }

}
