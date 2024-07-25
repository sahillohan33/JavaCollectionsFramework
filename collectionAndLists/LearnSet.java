package collectionAndLists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set=new HashSet<>();

        // Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(12);
        set.add(15);
        set.add(45);
      //  set.add(10);
     //   set.add(10);

        set.add(40);
        set.add(30);
        System.out.println(set.contains(12));
        System.out.println(set);

    }
}
