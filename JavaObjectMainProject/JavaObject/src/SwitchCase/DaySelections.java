package SwitchCase;

import java.util.Scanner;

public class DaySelections {
    public static void main(String args[]) {
        Day_Selection ds = new Day_Selection();
        System.out.println("Enter the day you want");
        Scanner scan = new Scanner(System.in);

        ds.selectDay(scan.nextLine());
    }
    public void selectDay(String dayName){
        switch (dayName){

            case "Sunday":
                System.out.println("Amar want to come to class");

            case "Monday":
                System.out.println("Srikanth wants go to work");

            case "Tuesday":
                System.out.println("Jismal wants to do shopping");

            case "Wedday":
                System.out.println("Divya wants to cook chicken biryani and bring it to the class");

            case "Thursday":
                System.out.println("Pradip wants to take medcine");
                break;
            case "Friday":
                System.out.println("Prakash want to go to pub");

            case "Saturday":
                System.out.println("Aprana wants to Relax Time, Pubbing Time, Party Time");

            default:
                System.out.println("Holidays");

        }
    }



}
