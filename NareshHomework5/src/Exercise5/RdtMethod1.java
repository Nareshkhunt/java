package Exercise5;

public class RdtMethod1 {
    float calculation(float x, float y)	//float type parameterized function
    {float z=x+y;
        //System.out.println(z);
        return x + y;
    }
    void calculation (int x, float y)	    // void type parameterized function
    {
        double s=x+y;
        System.out.println("Sum of the value.. = " + s);

    }
    int calculation(int x, int y)	//int type parameterized function, formal parameter
    {int z=x+y;
        //System.out.println(z);
        return x + y;
    }
            public static void main(String[] args) {
            RdtMethod1 ob=new RdtMethod1();   //Object creation part
            int s=ob.calculation(145,125); //Actual function call integer method
            float f=ob.calculation(14.5f,1.25f); //Actual function float method
                ob.calculation(5,5.5f);
                System.out.println(s);
                System.out.println(f);
        }
    }



