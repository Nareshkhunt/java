package oops2;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        mt.tableOf(5);
        mt.tableOf(10);
        mt.tableOf(12);
    }

    public void tableOf(int n){
        System.out.println("Table of "+n+":");
        System.out.println("---------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }
        System.out.println("---------------------------");
    }
}
