package Arrays;

/**
 * Created by User on 18/12/2017.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int a[][] = {{2,4,6}, {45,65,34}, {123,234,456}};
        for(int row=0;row<3;row++) {
            for(int col=0;col<3;col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
