package ImportantJavaProgram;

public class Array1ForEach {
    public static void main(String[] args) {
        String str[]={"Naresh","Nitin","Hiren","Vedant","Dvira","Jan","Feb","March","Apr","May"};
        for (String names:str){
            System.out.print(names+" ");

        }
        System.out.println("\n"+"No of elements in string : "+str.length);

    }
}
