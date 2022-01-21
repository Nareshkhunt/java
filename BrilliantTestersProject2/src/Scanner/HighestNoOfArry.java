package Scanner;

import java.util.Arrays;

public class HighestNoOfArry {
    public static void main(String[] args)
    {
        int a[]={2,13,25,46,67,89,21,5};
        Arrays.sort(a);
        System.out.println("Largest Number :"+a[a.length-1]);
        System.out.println("second Largest Numbber :" +a[a.length-2]);
    }

}
