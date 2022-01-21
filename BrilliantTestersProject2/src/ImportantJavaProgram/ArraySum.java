package ImportantJavaProgram;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Sum of numbers in given Array:");
        System.out.println("---------------------------");
        int numbers[] = {3, 56, 7, 9, 11, 77, 99, 105, 13};
        int sum=0;
        for (int i=0;i<=numbers.length-1;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
        System.out.println("------------------------------");
    }
}