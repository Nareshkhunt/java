package ImportantJavaProgram;

public class OddNo1To100 {
    public static void main(String[] args) {
        OddNo1To100 ob=new OddNo1To100();
        ob.oddOf(1,100);
    }
    public void oddOf(int from, int to){
        System.out.println("Odd Number from 1 to 100:");
        System.out.println("_________________________");
        for(int i=from;i<=to;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("_________________________");
    }
}
