package javaconcepts;

/**
 * Created by User on 20/08/2017.
 */
public class ArryaDemo3 {
    public static void main(String[] args) {
        int[][] tableOne = {{23,34,45},{45,67,78,23},{87,45,75}};
        for (int r=0;r<tableOne.length;r++) {
            for (int c=0;c < tableOne[r].length;c++) {
                System.out.println(tableOne[r][c]);
            }
        }
    }
}
