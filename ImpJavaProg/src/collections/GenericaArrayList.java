package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericaArrayList {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(null);
       // list.add(10.25); float cant add

        int i = list.get(0);
        System.out.println(i);
    }

}
