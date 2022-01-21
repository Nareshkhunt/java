package ImportantJavaProgram;

public class DivisonOf5 {
    public static void main(String[] args) {
        System.out.println("Division of 5 from 1 to 100:");
        DivisonOf5 ob=new DivisonOf5();
        ob.diviOf(1,100);

    }
    public void diviOf(int from,int to){
        for(int i=from;i<=to;i++){
            if(i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
