package javaconcepts;

/**
 * Created by User on 20/08/2017.
 */
public class ArrayDemo2 {
    int marks[] = {90, 80, 91, 89, 78, 45};

    public void printMarks(int index) {
        System.out.println(marks[index]);
    }


    public void printSri(int index) {
        int sri[] = marks;
        sri[index] = 67;
        System.out.println(sri[4]);
        System.out.println(marks[4]);
    }

    public void printAtul(int index) {
        int atul[] = marks;
//        atul[index] = 456;
        System.out.println(marks[index]);
        System.out.println(atul[index]);
    }

    public static void main(String args[]) {

        ArrayDemo2 a2=new ArrayDemo2();
//        a2.printMarks(4);
//        a2.printSri(4);
        a2.printAtul(4);


    }
}
