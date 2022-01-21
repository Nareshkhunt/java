package variables;

public class SwitchCase {

    public static void daySelection(String dayName){

        switch (dayName) {
            case "Monday":
                System.out.println("Day number 1");
                break;
            case "Tuesday":
                System.out.println("Day number 2");
                break;
            case "Wednesday":
                System.out.println("Day number 3");
                break;
            case "Thursday":
                System.out.println("Day number 4");
                break;
            case "Friday":
                System.out.println("Day number 5");
                break;
            case "Saturday":
                System.out.println("Day number 6");
                break;
            case "Holiday":
                System.out.println("Day number 7");
                break;
            default:
                System.out.println("Invalid day");
        }

    }

    public static void main(String[] args) {
        daySelection("Holidy");
    }

}
