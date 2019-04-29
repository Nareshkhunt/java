import java.util.Scanner;

public class FindIndexOfArrayElemtns {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 12,15,26,36 or 56 to find its Index:");
        int x=sc.nextInt();
        int a[]={12,15,26,36,56};
        for (int i=0;i<a.length;i++)
        {
            if (a[i] ==x)
            {
                System.out.println(a[i]+ " is on array index number "+i);
                break;
            }
        }
    }
}
