package Arrays;

/**
 * Created by User on 05/10/2017.
 */
public class ArrayPractice {

    public static void main(String[] args) {
        //declaring an array of integer
        int a[];
        //(or) int[] a;

        //instantiating an array (providing the size of the array)
        a = new int[4]; // Index values are 0, 1, 2, 3

        //int[] a = new int[4];
        //char[] b = new char[4];
        //int[] b = new long[4]; //this is not possible, u will get incompatible type error


        //storing the values into the array
        a[2] =45;
        a[0] =445;
        a[1] =475;
        a[3] =945;

        // array index out of bounds exception for the below index
//         a[4] =45;

        // printing the array values
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("Size of the array: "+a.length);


        String names[] = {"vikas","praveena","srinivas","shwetha","srikanth","john"};
        System.out.println(names[3]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[5]);
        // array index out of bounds exception for the below statement
        //System.out.println(names[6]);
        System.out.println("Total number of students: "+names.length);

    }


}
