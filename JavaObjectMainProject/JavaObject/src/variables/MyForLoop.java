package variables;

public class MyForLoop {

    public static void creatTable(int tableNo){

        System.out.println("this is my time tabel of "+tableNo);
        System.out.println("--------------------------");

        for(int a=1; a<=10; a++){
            System.out.println(tableNo+"*"+a+"="+tableNo*a);
        }
        System.out.println("-------------------------------");

    }

    public static void main(String[] args) {


//       creatTable(12);
       creatTable(102);
    }
}

