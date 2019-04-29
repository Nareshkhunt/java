package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Raman");
        list.add(10.25);
        list.add('c');
        list.add(true);
        list.add(null);
        list.add("Raman");
        int mysize=list.size();
        System.out.println(mysize);
        System.out.println(list.get(0));
        int a = (Integer)list.get(0);//integer object to int
        System.out.println(20+a);
        //how to fetch the values from a list

		System.out.println(list.get(0));
		System.out.println(list.get(3));
		//System.out.println(list.get(7));

		//remove

		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
//print with for
		for(int i=0;i<list.size(); i++){

			System.out.println(list.get(i));
		}
//print with for each
		for(Object var:list){

			System.out.println(var);
		}
//print with iterator
		Iterator itr = list.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

    }

}
