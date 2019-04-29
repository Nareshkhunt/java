package conditionalStatments;

import java.util.Scanner;

/**
 * Created by User on 04/09/2017.
 */
public class IfConditionDemo1 {
    public static void main(String[] args) {
//        int age=10;
//        System.out.println("please enter your age");

        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();

//        if(age>16) {
//        System.out.println("You are eligible to vote");
//        System.out.println("Welcome to voting world");
//        }
//        System.out.println("You are not eligible to vote");

        System.out.println("Please enter your balance");
        int myBalance = scanner.nextInt();
        int minBalance = 20;
        if(myBalance >= minBalance) {
            System.out.println("Gates opened");
        }
        System.out.println("you do not have enough balance, please top up");


    }
}
