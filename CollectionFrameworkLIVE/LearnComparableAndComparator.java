package CollectionFrameworkLIVE;

// import java.util.ArrayList;
import java.util.*;

class MyCustomDogComparator implements Comparator<Animal>{

        @Override
        public int compare(Animal o1, Animal o2) {
                return Integer.compare(o1.weight, o2.weight);
        }
}
public class LearnComparableAndComparator {
        public static void main(String[] args) {
                Animal a1=new Animal(5,"Leo",12);
                Animal a2=new Animal(3,"Cow",10);
                Animal a3=new Animal(4,"Dog",6);
                Animal a4=new Animal(6,"Lion",7);
                Animal a5=new Animal(6,"Tiger",7);
                List<Animal> dogs=new ArrayList<>();
                dogs.add(a1);
                dogs.add(a2);
                dogs.add(a3);
                dogs.add(a4);
                dogs.add(a5);
                System.out.println(dogs);
                // Collections.sort(dogs);
                Collections.sort(dogs,new MyCustomDogComparator());
            /*   Collections.sort(dogs, new Comparator<Animal>() {
                        @Override
                        public int compare(Animal o1, Animal o2) {
                                return o1.name.compareTo(o2.name);
                        }
                });
*/
        Collections.sort(dogs,Comparator.comparing(Animal::getAge) );
                System.out.println(dogs);
        }
}
