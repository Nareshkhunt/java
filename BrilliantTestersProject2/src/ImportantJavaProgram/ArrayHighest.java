package ImportantJavaProgram;

public class ArrayHighest {
    public static void main(String[] args) {
        int a[]={23,6,47,35,2,14};
        int largest=a[0];
        int smallest=a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>largest){
                largest=a[i];
            }
            else if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
