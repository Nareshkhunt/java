package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by User on 18/12/2017.
 */
public class ListsPractice1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Srikanth");
        nameList.add("Mounika");
        nameList.add("Archana");
        nameList.add("Sahithi");
        nameList.add(1, "Prathima");

        Iterator iterator = nameList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}











