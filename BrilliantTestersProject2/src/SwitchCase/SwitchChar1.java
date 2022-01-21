package SwitchCase;

public class SwitchChar1 {
    public static void main(String[] args) {
        char myChar='a';
        String myDay;
        switch (myChar){
            case 'a':myDay="Mon";
                System.out.println(myDay);
                break;
            case 'b':myDay="Tues";
                System.out.println(myDay);
            case 'c':myDay="wed";
                System.out.println(myDay);
            case 'd':myDay="thur";
                System.out.println(myDay);
            case 'e':myDay="fri";
                System.out.println(myDay);
            case 'f':myDay="sat";
                System.out.println(myDay);
                break;
            case 'g':myDay="sun";
                System.out.println(myDay);
            default:
                System.out.println("invalid");
        }

    }
}

