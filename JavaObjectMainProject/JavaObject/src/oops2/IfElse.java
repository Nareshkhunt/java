package oops2;

/**
 * Created by User on 27/11/2016.
 */
public class IfElse {
    public static void main(String[] args) {
        //if statement
        String day = "Saturday";

        //if else statement or if else if statement
        if(day.equalsIgnoreCase("saturday")){
            System.out.println("Today is Saturday");
            System.out.println(day.length());
        }else if(day.equals("Monday")){
            System.out.println("Today is not Monday");
        }
        else{
            System.out.println("Today is Sunday");

        }

    }
}
