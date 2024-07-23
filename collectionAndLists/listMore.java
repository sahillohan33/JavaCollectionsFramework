package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listMore {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");
        for(int i=0; i<fruits.size();i++){
            System.out.println("Fruits is "+fruits.get(i));
        }

        for(String fruit: fruits){
            System.out.println("For each fruits "+fruit);
        }
       Iterator<String> fe=fruits.iterator();
   //     Iterator<String> fe=fruits.listIterator();
        while(fe.hasNext()){
            System.out.println("Iterator "+fe.next());
        }
        List<String> smallList=fruits.subList(1,2);
        System.out.println(smallList);
    }
}