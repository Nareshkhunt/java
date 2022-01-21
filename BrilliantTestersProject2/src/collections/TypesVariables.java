package collections;

public class TypesVariables {

    static int myAge = 40;//static varioble
    int c=41;//instance variable or globle

//user defined method
    void addition(){
       int age=75;//local variable
    }
    //user defined method
    void sub(){
        int yourAge=30;
    }



    public static void main(String[] args) {
        //static valibale can be used every where in the class but can't change it
        System.out.println(myAge);
        int data=50;//instance variable
        System.out.println(data);
    }
}
