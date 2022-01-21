package ConstructorMethod;

public class DefaultConstructor {
    int id;
    String name;
    float height;
    boolean status;
    char gender;
    public void emp(){
        System.out.println("Student Id:"+id);
        System.out.println("Student Nmae:"+name);
        System.out.println("Student height:"+height);
        System.out.println("Student Status:"+status);
        System.out.println("Student Status:"+gender);
    }
    public static void main(String[] args) {
        DefaultConstructor ob=new DefaultConstructor();
        ob.emp();
    }

}
