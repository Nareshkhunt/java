package Scanner;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Month Name\t:");
        String month=sc.next().toLowerCase();
        switch (month)
        {
            case "january" :
                System.out.println("\nThere is 31 days in January");
                break;
            case "february":
                System.out.println("\nThere is 28 or 29 days in February");
                break;
            case "march":
                System.out.println("\nThere is 31 days in March");
                break;
            case "april":
                System.out.println("\nThere is 30 days in April");
                break;
            case "may":
                System.out.println("\nThere is 31 days in May");
                break;
            case "june":
                System.out.println("\nThere is 30 days in June");
                break;
            case "july":
                System.out.println("\nThere is 31 days in July");
                break;
            case "august":
                System.out.println("\nThere is 31 days in August");
                break;
            case "september":
                System.out.println("\nThere is 30 days in September");
                break;
            case "october":
                System.out.println("\nThere is 31 day in October");
                break;
            case "november":
                System.out.println("\nThere is 30 days in November");
                break;
            case "december":
                System.out.println("\nThere is 31 days in December");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
