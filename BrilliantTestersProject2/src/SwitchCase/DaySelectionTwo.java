package SwitchCase;

import java.util.Scanner;

/**
 * Created by User on 27/11/2016.
 */
public class DaySelectionTwo {
    public static void main(String args[]) {
        //Print message to warn to enter the number for selection of the day
        System.out.println("Please enter day number");
        //Scan the values form the keyboard
        Scanner scanner =new Scanner(System.in);
        //Store it in integer varaiable
        int dayNumber = scanner.nextInt();
        //create an object for the current class
        DaySelectionTwo ds = new DaySelectionTwo();
        //call the method
        ds.selectDay(dayNumber);
    }
    public void selectDay(int dayNumber){
        switch (dayNumber){

            case 1:
                System.out.println("Shilpa dont want to come to class");
                break;
            case 2:
                System.out.println("Krishh wants day off");
                break;
            case 3:
                System.out.println("Bhavani wants to follow the schedule");
                break;
            case 4:
                System.out.println("Just an another day");
                break;
            case 5:
                System.out.println("Hiren wants to plan weekend");
                break;
            case 6:
                System.out.println("Bindu dont want to cook");
                break;
            case 7:
                System.out.println("Relax Time, Pubbing Time, Party Time");
                break;
            default:
                System.out.println("Please enter day number between 1 to 7");
        }
    }

}
