package encapsulation;

import java.util.Scanner;

/**
 * Created by User on 20/12/2015.
 */
public class Test {
    public static void main(String[] args){
        Student s=new Student();

        Scanner scanner=new Scanner(System.in);
        System.out.println("What name you want to set?");
        String name=scanner.nextLine();


        s.setName(name);
        System.out.println("You Have :"+s.getName());


        s.setName("Srikanth");
        System.out.println("You entered :"+s.getName());


        System.out.println("Please enter ur age");
        int somevalue=scanner.nextInt();

        System.out.println("Your age entered is:"+somevalue);
    }
}
