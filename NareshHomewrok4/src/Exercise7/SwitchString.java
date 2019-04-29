package Exercise7;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

public class SwitchString {
    public static void main(String args[]) {
        SwitchString ob = new SwitchString();
        ob.selectMonth("Jan");
        ob.selectMonth("May");

    }
    public void selectMonth(String monthName) {

        switch (monthName) {
            case "Jan":
                System.out.println("Amman month of birth");
                break;

            case "Feb":
                System.out.println("naresh month of birth");
                break;

            case "March":
                System.out.println("Viren month of birth");
                break;

            case "Apr":
                System.out.println("Priya and Induja month of birth");
                break;

            case "May":
                System.out.println("Nitin month of birth");
                break;
            case "June":
                System.out.println("Bhaskar month of birth");

            case "july":
                System.out.println("Zubeda month of birth");

            default:
                System.out.println("invalid");

        }
    }
}





