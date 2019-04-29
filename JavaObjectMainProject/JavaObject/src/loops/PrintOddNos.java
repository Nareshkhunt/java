package loops;

/**
 * Created by User on 04/12/2016.
 */
public class PrintOddNos {
    public static void main(String[] args) {
       PrintOddNos p1 = new PrintOddNos();
//        p1.printOddNos(200,504);
        p1.printOddNos(10,20);
    }

    public void printOddNos(int from, int to) {
        for (int i=from;i<=to;i++) {
            if (i%3!=0) {
                System.out.print(i + "\b");
            }
        }
    }
}
