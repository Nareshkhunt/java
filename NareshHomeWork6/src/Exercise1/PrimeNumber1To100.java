package Exercise1;

public class PrimeNumber1To100 {
    public static void main(String[] args) {
        PrimeNumber1To100 ob=new PrimeNumber1To100();
        ob.primeNumber(1,100);

    }

    public void primeNumber(int from, int to) {
        for (int i = from; i <= to; i++) {
            boolean flag=true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag=false;
                    break;
                }

                }
                if (flag==true){
                   System.out.println(i);

            }

        }
    }
}
