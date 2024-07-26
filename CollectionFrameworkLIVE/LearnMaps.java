package CollectionFrameworkLIVE;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        map.put("US","United States");
        map.put("IN","India");
        map.putIfAbsent("IN","Inida2");
        map.put("EN","England");
        System.out.println(map);
        Set<Map.Entry<String,String>> entries=map.entrySet();
        for(Map.Entry<String,String> entry:entries){
            // System.out.println(entry);
            System.out.println(entry.getKey() +","+entry.getValue());

        }

      //  map.remove("IN");
      //  System.out.println(map);

        /*
        ArrayList<String> keys=new ArrayList<>(map.keySet());
        Collection<String> values=map.values();
        System.out.println(values);
         System.out.println(keys);

        System.out.println(map.containsKey("pn"));

        System.out.println(map.get("IN"));
        System.out.println(map.getOrDefault("in","Others"));
    */
    }
}
