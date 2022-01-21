package Scanner;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("\nEnter Character to Find Is it Vowel or Consonant : ");
        String ch = sc.next().toLowerCase();
        boolean uppercase = ch.charAt(0)>='A' && ch.charAt(0)<='Z';
        boolean lowercase = ch.charAt(0)>='a' && ch.charAt(0)<='z';
        boolean Vowels = ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u");

        if (ch.length()>1)
        {
            System.out.println("\nError Not a single character");
        }else if (!(uppercase||lowercase))
        {
            System.out.println("\n Error not a Letter. Enter an Alphabet");
        }else if(Vowels)
        {
            System.out.println("\nInput alphabet " +ch+ " is Vowel" );
        }else
        {
            System.out.println("\nInput alphabet " +ch+ " is Consonant");
        }
    }
}
