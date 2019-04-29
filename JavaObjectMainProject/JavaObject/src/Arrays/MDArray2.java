package Arrays;

/**
 * Created by User on 18/12/2017.
 */
public class MDArray2 {
    public static void main(String[] args) {
        int a[][] = {{2,4,45,56}, {45,65,34}, {123,234,456,45},{45,56,56,57,57,57,57,575}};
        for(int row=0;row<a.length;row++) {


            for(int col=0;col<a[row].length;col++) {
                System.out.print(a[row][col] + " ");
            }


            System.out.println();
        }
    }
}
