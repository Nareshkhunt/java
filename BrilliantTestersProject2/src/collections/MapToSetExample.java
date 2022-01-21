package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapToSetExample {
    public static void main(String[] args) { // TODO Auto-generated method stub

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(0, "hello");
        hm.put(1, "Gudbye");
        hm.put(42, "morning");
        hm.put(3, "evening");
        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));

        Set sn= hm.entrySet(); //converting into set


        Iterator it =sn.iterator(); //hashtable -pass table set collections

        while(it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
        //or
        Set<Integer> keys = hm.keySet();
        for(Integer key:keys){
            System.out.println("Key --> "+key+"  Value is -->"+hm.get(key));
        }


        System.out.println(hm);
    }
}
