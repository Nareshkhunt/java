package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetexample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Raman");
        set.add("Way2Automation");
        set.add("Selenium");
        set.add("Appium");
        set.add("Raman");
        System.out.println(set);
	//with for loop
		for(int i=0; i<set.size(); i++){

            System.out.println();
		}
		//for each
		for(String var:set){

			System.out.println(var);
		}
//with iterator
        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){

            String var = itr.next();
            if(var.equals("Appium")){
                System.out.println(var);
            }
        }

    }
}
