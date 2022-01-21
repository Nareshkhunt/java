package collections;

public class InterviewClass {
    public static void main(String[] args) {

        int a[]= {4,6,4,8,1};
        sort(a);

    }

    public static void sort(int[] a){

        int maxValue = a[0];
        for (int i=0; i<a.length;i++){

            if (a[i] >maxValue){
                maxValue = a[i];
            }

        }
        System.out.println(maxValue);
    }
}
