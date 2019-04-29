package oops2;

/**
 * Created by User on 27/11/2016.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        //if statement
        String day = "Sunday";

        //switch statement
        switch(day){
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Today is Saturday");
        }

    }
}
