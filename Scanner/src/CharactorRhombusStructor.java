import java.util.Scanner;

public class CharactorRhombusStructor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of row:");
        int x = sc.nextInt();
        int a=1;
        int start=1;
        char ch='A';
        for (int i=1;i<=(x*2);i++)
        {
            for (int j = x - start; j > 0; j--)  // print space
            {
                System.out.print(" ");
            }
            if (i < x)
            {
                start++;
            }
            else
            {
                start--;
            }
            for (int k = 0; k < a; k++)
            {
                System.out.print(ch);
                if (k < a / 2)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            if (i < x)
            {
                a = a + 2;
            }
            else
            {
                a = a - 2;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
