package CollectionFrameworkLIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnMaps {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        map.put("US","United States");
        map.put("IN","India");
        map.putIfAbsent("IN","Inida2");
        map.put("EN","Inida");
        System.out.println(map);

      //  map.remove("IN");
      //  System.out.println(map);

        System.out.println(map.containsKey("pn"));

    }
}
