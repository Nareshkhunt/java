package javaconcepts;

/**
 * Created by User on 20/08/2017.
 */
public class ArrayDemo1 {
    public static void main(String args[]) {
        int marks[] = {90,80,91,89,78,45};
        System.out.println(marks[4]);


        int sri[] = marks;
        sri[4] =67;
        System.out.println(sri[4]);
        System.out.println(marks[4]);


        int atul[] = sri;
        atul[4]=456;
        System.out.println(sri[4]);
        System.out.println(marks[4]);
        System.out.println(atul[4]+" "+atul[1]);


    }
}
