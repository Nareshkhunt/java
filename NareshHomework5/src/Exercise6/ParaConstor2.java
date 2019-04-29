package Exercise6;

public class ParaConstor2 {
    int id;
    String name;
    float height;
    boolean status;

    ParaConstor2() {//user def o-arg constructor
        id = 1;
        name = "naresh";
        height = 10.05f;
        status = true;}
//4-arg parameterised constructor
        ParaConstor2(int id, String name, float height, boolean status){
           this.id=id;
           this.name=name;
           this.height=height;
           this.status=status;
        }

    public void emp () {
            System.out.println("Student Id:"+id);
            System.out.println("Student Nmae:"+name);
            System.out.println("Student height:"+height);
            System.out.println("Student Status:"+status);
        }
        public static void main (String[]args){
            ParaConstor2 ob = new ParaConstor2();
            ob.emp();
            ParaConstor2 ob1=new ParaConstor2(3,"naresh",10.05f,true);
            ob1.emp();
        }
    }
