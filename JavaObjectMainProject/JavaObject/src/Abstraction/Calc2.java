package Abstraction;

/**
 * Created by User on 04/12/2016.
 */
public class Calc2 {
    static Calc1 c1;
    static MyInterface mc;
    public static void main(String[] args) {
//        c1 = new Calc1();
//        mc = new Calc1();
//        mc.add(23,45);
        String name = "SRIKANTH";
        System.out.println("No. of characters in the String: " + name.length());
        System.out.println("Character at 3rd place: " + name.charAt(2));
        System.out.println("Given text contains: " + name.contains("sri"));
        System.out.println("Given text equals: " + name.equals("Srikanth"));
        System.out.println("Given text equals (ignore case): " + name.equalsIgnoreCase("srikanTH"));
        System.out.println("Convert into Lowercase: " + name.toLowerCase());
        String name2 = "sdfdsgdsfdfhd";
        System.out.println("Convert into Uppercase: " + name2.toUpperCase());
    }
}