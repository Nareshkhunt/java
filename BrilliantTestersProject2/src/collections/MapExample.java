package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("firstName", "Raman");
        map.put("lastName", "Arora");
        map.put("sub", "Selenium");
        map.put("location", "India");
        map.put("name", "Rahul");

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("firstName"));


        map.values();

       Set<String> keys =map.keySet();

        for(String key:keys){
            System.out.println(key);
            System.out.println(map.get(key));
//            System.out.println("Key --> "+key+"  Value is -->"+map.get(key));
        }


//        Map<String, List<String>> map1 = new HashMap<String,List<String>>();
//
//        List<String> listofEmails = new ArrayList<String>();
//        listofEmails.add("trainer@way2automation.com");
//        listofEmails.add("seleniumcoaching@gmail.com");
//        listofEmails.add("corporate@way2automation.com");
//        listofEmails.add("info@way2automation.com");
//
//        map1.put("email", listofEmails);
//
//        Map<String,Map<String,String>> map2 = new HashMap<String,Map<String,String>>();



    }

}
