package Scanner;

import java.util.Scanner;

public class FindCity {
         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter city's first charactor\t:");
             String city = sc.next();
        if (city.equalsIgnoreCase("a") )
        {
            System.out.println("JavaPractice.City name = Ahmedabad");
        } else if (city.equalsIgnoreCase("b") )
        {
            System.out.println("JavaPractice.City name = Bombay");
        } else if (city.equalsIgnoreCase("c") )
        {
            System.out.println("JavaPractice.City name = Culcatta");
        } else if (city.equalsIgnoreCase("d"))
        {
            System.out.println("JavaPractice.City name = Delhi");
        } else if (city.equalsIgnoreCase("e"))
        {
            System.out.println("JavaPractice.City name = Eddingbaro");
        } else if (city.equalsIgnoreCase("f"))
        {
            System.out.println("JavaPractice.City name = France");
        } else
        {
            System.out.println("Input not valid Should be Between A to F");
        }
    }

    }
