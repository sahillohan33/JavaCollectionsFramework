package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
      //  int a[]=new int[5];

        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(1);

        list2.add(1);
        list2.add(2);



        System.out.println(list);
        System.out.println(list2);
        // list.addAll(list2);
        /*
        System.out.println(list.size());
        System.out.println(list.contains(30));
        list.remove(3);
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        list.removeAll(list2);

        System.out.println(list);
*/
        /*
        list.retainAll(list2);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        */
/*
    Object a[]=list.toArray();
    for(Object e:a){
        Integer temp=(Integer)e;
        System.out.println(e);
    }
        System.out.println(list);
    */



    }
}
