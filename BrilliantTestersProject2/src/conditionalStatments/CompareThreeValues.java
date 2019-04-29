package conditionalStatments;

/**
 * Created by User on 13/09/2017.
 */
public class CompareThreeValues {
    public static void main(String[] args) {
        CompareThreeValues compare = new CompareThreeValues();
        compare.compare1(23,45,75);
        compare.compare1(223,145,75);
        compare.compare1(223,445,75);
        compare.compare1(223,445,675);
    }
// Print greatest value amongst 3 numbers
    public void compare1(int x, int y, int z) {
        if(x>y) {
            if(x>z)
                System.out.println(x+" is greatest value");
            else
                System.out.println(z+" is greatest value");
        }
        else {
            if(y>z)
                System.out.println(y+" is greatest value");
            else
                System.out.println(z+" is greatest value");
        }
    }
}
