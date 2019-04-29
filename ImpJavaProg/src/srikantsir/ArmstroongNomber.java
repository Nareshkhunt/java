package srikantsir;
/* A positive number is called armstrong number
 if it is equal to the sum of cubes of its digits
 for example 0, 1, 153, 370, 371, 407 etc.
  */

public class ArmstroongNomber {
    public static void main(String[] args) {
        ArmstroongNomber ob=new ArmstroongNomber();
        ob.calArm(153);
        ob.calArm(300);
        ob.calArm(555);
        ob.calArm(407);
    }
    public void calArm(int n){
        System.out.println("Given no is:"+n);
        int sum=0,r,temp;
        temp=n;
           while(n>0)
               {
              r=n%10;
              n=n/10;//1 loop n=153,2nd loop n=153/10=15.3=15(int)
                   //3rd loop n=15/10=1.5=1(int)
              sum=sum+(r*r*r);//r1=3,r2=5,r3=1
                }
          if(temp==sum)
               System.out.println("Armstrong number:");
          else
              System.out.println("Not an Armstrong number:");
         }
}
