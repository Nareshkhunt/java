import java.util.Scanner;

public class InterChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter value of A:\t");
        int a = sc.nextInt();
        System.out.print("Enter value of B:\t");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("\nThe Value in A= " + a);
        System.out.println("\nThe Value in B= " + b);

    }
}
