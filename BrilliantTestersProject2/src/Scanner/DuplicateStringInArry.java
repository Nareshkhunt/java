package Scanner;

public class DuplicateStringInArry {
    public static void main(String[] args)
    {
        String[] s ={"jayenra","aum","bhoomi","aum","bhavesha"};
        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i]+",");

        }
        for (int i = 0; i <s.length ; i++)
        {
            for (int j = i+1; j <s.length ; j++)
            {
                if (s[i].equals(s[j]))
                {
                    System.out.println("\n The Duplicate elements is :"+s[i]);
                }
            }
        }
    }

}
