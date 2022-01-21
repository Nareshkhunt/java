package Scanner;

import java.util.Scanner;
/*a year, occurring once every four years,
 which has 366 days including 29 February as an intercalary day.
1, year can divided by 400
2,year can be divided by 4 but not by 100
  */

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("\nEnter Year in YYYY Format\t:");
        int y=scanner.nextInt();
        if ((y% 400 == 0) || ((y% 4== 0) && (y% 100!= 0))){
            //one condn         both condition must be true
            System.out.println(y+"\tis a leap year");
        }
        else  {
            System.out.println(y+" "+"is not leap year");
        }

    }
}
