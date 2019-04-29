package javaconcepts;

/**
 * Created by User on 20/12/2015.
 */
public class JavaConcepts2 {

    public static void main(String args[])
    {
//        int k=34;
//        long s=12;
//        int[] a=new int[k];
//        long[] b=new long[k];

        //type 1 declaration
        int marks[];
        marks=new int[5];
        //-----------------------
        //type 2 declaration
        int[] marks1=new int[5];

        //type1 assigning values to the array
        marks1[0]=34;
        marks1[1]=134;
        marks1[2]=334;
        marks1[3]=3114;
        marks1[4]=324;

        //type2 assigning values to the array
        int marks2[]={23,45,56,546,45,456,464,657,678,7897};
        System.out.println(marks2[21]);
        System.out.println("size of the array Marks1= "+marks1.length);
        System.out.println("size of the array Marks2= "+marks2.length);





    }
}
