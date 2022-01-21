package ImportantJavaProgram;

public class EvenNo1To100 {
    public static void main(String[] args) {
        EvenNo1To100 ob=new EvenNo1To100();
        ob.evenOf(1,100);

    }
    public void evenOf(int start,int end) {
        System.out.println("Even no for 1 to 100:");
        System.out.println("_____________________");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("______________________");
    }
}
