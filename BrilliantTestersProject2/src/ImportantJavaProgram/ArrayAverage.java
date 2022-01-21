package ImportantJavaProgram;

public class ArrayAverage {
    public void averageOf(int a[]){
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println("the average value of give array :"+(sum/a.length));
    }
    public static void main(String[] args) {
        ArrayAverage ob=new ArrayAverage();
        int a[]={23,6,47,35,2,14};
        ob.averageOf(a);
    }

}
