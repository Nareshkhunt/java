package SwitchCase;

public class SwitchInt {
    public static void main(String[] args) {
        int month=14;
        String myMonth;
        switch (month){
            case 1:myMonth="jan";
                System.out.println(myMonth);
            case 2:myMonth="feb";
                System.out.println(myMonth);
            case 3:myMonth="march";
                System.out.println(myMonth);
            case 4:myMonth="apr";
                System.out.println(myMonth);
            case 5:myMonth="may";
                System.out.println(myMonth);
            case 6:myMonth="jun";
                System.out.println(myMonth);
            break;
            case 7:myMonth="july";
                System.out.println(myMonth);
            case 8:myMonth="aug";
                System.out.println(myMonth);
            case 9:myMonth="sep";
                System.out.println(myMonth);
            case 10:myMonth="octo";
                System.out.println(myMonth);
            case 11:myMonth="nove";
                System.out.println(myMonth);
            case 12:myMonth="dec";
                System.out.println(myMonth);
            default:
                System.out.println("invalid");
        }

    }
}
