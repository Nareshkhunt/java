package loops;

/**
 * Created by User on 16/01/2016.
 */
public class Loop1 {
    public static void main(String args[])
    {

        Loop1 l1 = new Loop1();
        l1.sumOf(1,100);
    }


    public void sumOf(int start, int end) {
        int result=0;
        for(int i=start;i<=end;i++)
        {

            result=result+i;
        }
        System.out.println("Sum of 1 to 100 is: "+ result);
    }
}
