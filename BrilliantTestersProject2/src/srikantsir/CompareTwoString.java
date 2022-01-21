package srikantsir;

public class CompareTwoString {
    public static void main(String[] args) {
        String str1 = "vedant2";
        String str2 = "vedant";
        if (str1.compareTo(str2) > 0)
            System.out.println("First string is greater than second.");
        else if (str1.compareTo(str2) < 0)
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");
    }
}


