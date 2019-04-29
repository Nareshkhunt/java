package ArrayLists;

import java.util.ArrayList;

/**
 * Created by User on 18/12/2017.
 */
public class ListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Srikanth");
        nameList.add("Mounika");
        nameList.add("Archana");
        nameList.add("Sahithi");
        nameList.add(1, "Prathima");
        nameList.remove(1);

    //  for (int i=0;i<nameList.size();i++) {
      //      System.out.println(nameList.get(i));
       //}

       for(String names:nameList) {
           System.out.println(names);
       }
    }
}
