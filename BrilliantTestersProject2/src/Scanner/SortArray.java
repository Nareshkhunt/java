package Scanner;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args)
    {
        int a[] = {33,10,15,16,35};
        String s[] = {"jayendra","bhavesh","arvind","kavita","sneha","niyam","suresh"};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("");
        Arrays.sort(s);
        for (int j=0;j<s.length;j++)
        {
            System.out.print(s[j]+",");
        }



    }
}
