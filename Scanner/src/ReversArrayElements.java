import java.util.ArrayList;
import java.util.Collections;

public class ReversArrayElements {
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new  ArrayList<Integer>();
        a.add(23);
        a.add(34);
        a.add(56);
        a.add(78);
        a.add(12);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
    }
}
