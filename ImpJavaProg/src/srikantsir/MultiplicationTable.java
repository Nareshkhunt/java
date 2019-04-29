package srikantsir;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable ob=new MultiplicationTable();
        ob.multiTab(5);
        ob.multiTab(11);
        ob.multiTab(1);
    }
    public void multiTab( int n){
        int result;
        System.out.println("Multiplication table of "+n+" is :-");
        for(int i=1;i<=10;i++){
            result=n*i;
            System.out.println(n+"*"+i+"="+result);
        }
    }
}
