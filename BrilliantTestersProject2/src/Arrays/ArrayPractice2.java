package Arrays;

/**
 * Created by User on 05/10/2017.
 */
public class ArrayPractice2 {

    public static void main(String[] args) {
        int a[] = {12,34,456,67};
//        int b[] =a;

//        System.out.println(b[3]);
//
//        b[3] = 45;
//
//        System.out.println(b[3]);
//        System.out.println(a[3]);

//        int c[] = a.clone();
        int c[] = a;

        System.out.println(c[3]);
        c[3] =68;
        System.out.println(a[3]);
        System.out.println(c[3]);


    }
}
