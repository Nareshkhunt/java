import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Seller's ID\t\t\t:");
        String sId= sc.next();
        System.out.print("Enter Seller's Name\t\t\t: ");
        String sName=sc.next();
        System.out.print("Enter Seller's Basic Salary : ");
        double bSal=sc.nextDouble();
        System.out.print("Enter Seller's Sales Amount : ");
        double sSalAmt=sc.nextDouble();
        double sCom;
        double gSal;
        if(sSalAmt>=50000)
        {
            sCom=sSalAmt*35/100;
        }else if(sSalAmt>=30000)
        {
            sCom=sSalAmt*20/100;
        }else if (sSalAmt>=20000)
        {
            sCom=sSalAmt*10/100;
        }else if (sSalAmt>=10000)
        {
            sCom=sSalAmt*5/100;
        }else if (sSalAmt<=10000 && sSalAmt >=1)
        {
            sCom=sSalAmt*2/100;
        }else {sCom=0;}
        gSal=bSal+sCom;
        System.out.print("\n\t\t Salary Slip");
        System.out.print("\n_________________________________________");
        System.out.print("\nSeller's Id\t\t: " +sId);
        System.out.print("\nSeller' Name\t: " +sName);
        System.out.print("\n_________________________________________");
        System.out.print("\nBasic Salary\t: "+bSal );
        System.out.println("\nCommission\t\t: "+sCom);
        System.out.print("\nGross Salary\t: "+gSal);
        System.out.print("\n_________________________________________");
    }
}
