package SwitchCase;

import java.util.Scanner;

/**
 * Created by User on 27/11/2016.
 */
public class Day_Selection {


    public static void main(String args[]) {
        Day_Selection ds = new Day_Selection();

        System.out.println("Enter the day you want");
        Scanner scan = new Scanner(System.in);

        ds.selectDay(scan.nextLine());
    }


    public void selectDay(String dayName){

       switch (dayName){
           case "Sunday":
               System.out.println("Amman want to come to class");
               break;

           case "Monday":
               System.out.println("Amutha wants go to work");
               break;

           case "Tuesday":
               System.out.println("Viren wants to do shopping");
               break;

           case "Wedday":
               System.out.println("Priya and Induja wants to cook chicken and Veg biryani and bring it to the class");
               break;

           case "Thursday":
               System.out.println("Nitin wants to take medcine");
                break;
           case "Friday":
               System.out.println("Bhaskar wants to go to pub");

           case "Saturday":
               System.out.println("Zubeda wants to Relax Time, Pubbing Time, Party Time");

           default:
               System.out.println("Holidays");

       }
    }



}
