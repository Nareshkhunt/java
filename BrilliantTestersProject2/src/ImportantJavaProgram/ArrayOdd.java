package ImportantJavaProgram;

public class ArrayOdd {
    public static void main(String[] args) {
        System.out.println("Odd numbers in given Array:");
        System.out.println("---------------------------");
        int numbers[] = {3, 56, 7, 9, 11, 77, 99, 105,13};
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i]+" ");

            }

        }
        System.out.println("\n"+"------------------------------");
    }
}