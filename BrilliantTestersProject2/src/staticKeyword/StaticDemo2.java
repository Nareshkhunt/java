package staticKeyword;

/**
 * Created by User on 04/09/2017.
 */
public class StaticDemo2 {
    int stuID;
    String stuName;
    static String schoolName = "DPS";

    public static void main(String[] args) {
//       StaticDemo2 s2= new StaticDemo2();
//        s2.studentDetails(1,"john");
//        s2.studentDetails(2,"smith");
//        s2.studentDetails(3,"ben");
        studentDetails(12,"Karan");

    }

    public static void studentDetails(int id, String name) {
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        StaticDemo2 s2= new StaticDemo2();
        System.out.println("School Name: "+s2.schoolName);
    }
}
