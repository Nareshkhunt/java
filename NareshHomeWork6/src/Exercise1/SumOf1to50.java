package Exercise1;

public class SumOf1to50 {
    public static void main(String[] args) {
        SumOf1to50 sum=new SumOf1to50();
        sum.sumOf(1,50);

    }
    public void sumOf(int start,int end){
        int result=0;
        for (int i=start;i<=end;i++){
            result=result+i;
        }
        System.out.println("Sum of 1 to 50 is: "+ result);
    }
}

