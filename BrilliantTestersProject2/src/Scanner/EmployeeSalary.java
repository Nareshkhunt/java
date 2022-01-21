package Scanner;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Employee ID\t\t\t: ");
        String eId= scan.next();
        System.out.print("Enter Employee Name\t\t\t: ");
        String eName=scan.next();
        System.out.print("Enter Employee Basic Salary : ");
        double eSal=scan.nextDouble();
        double hRa,tA,dA,pF;
        hRa=eSal*10/100;//health reimbursment allounce
        tA =eSal*9/100;
        dA =eSal*8/100;
        pF =eSal*20/100;
        double gSal= eSal+hRa+tA+dA-pF;
        System.out.print("\n\t\t Salary Slip");
        System.out.print("\n_________________________________________");
        System.out.print("\nEmployee Id\t\t: " +eId);
        System.out.print("\nEmployee Name\t: " +eName);
        System.out.print("\n_________________________________________");
        System.out.println("\nBasic Salary\t: "+eSal);
        System.out.println("\nHRA  10%\t\t: " +hRa);
        System.out.println("\nTA   8%\t\t\t: " +tA);
        System.out.println("\nDA   9%\t\t\t: " +dA);
        System.out.println("\nPF - 20&\t\t: " +pF);
        System.out.print("\n_________________________________________");
        System.out.println("\nGross Salary\t: "+gSal);
        System.out.print("\n_________________________________________");
    }
}
