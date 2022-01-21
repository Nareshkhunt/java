package StringDemo;

public class StringDemo {
    public static void main(String[] args) {
        String name = "INDIA IS GREAT";
        System.out.println("Character at 4th place: " + name.charAt(3));
        System.out.println("Given text contains: " + name.contains("IS"));
        System.out.println("Given text equals: " + name.equals("INDIA IS GREAT"));
        System.out.println("Given text equals (ignore case): " + name.equalsIgnoreCase("india IS GREAt"));
        System.out.println("Convert into Lowercase: " + name.toLowerCase());
        System.out.println("No. of characters in the String: " + name.length());
        String name2 = "Gujarat is the best state";
        System.out.println("Convert into Uppercase: " + name2.toUpperCase());
    //to verify if string contains digits or not
        System.out.println(name +" and "+ name2);
        String name3 ="nareshkhunt1512";
        System.out.println(name3 + "contains numbers:"+name3.matches(".*[1-9]"));//ending with numbers or numbers only
        System.out.println(name3 + "contains numbers:"+name3.matches(".*[.*1-9]"));//within the string
        System.out.println(name3 + "contains numbers:"+name3.matches("[1-9].*"));//ending with string

    String name4 = "Ayappa is best guru 123 hg99999AA";
        System.out.println(name4.matches(".*[A-Za-z][1-9].*"));
}
}
