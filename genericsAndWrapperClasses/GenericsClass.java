package genericsAndWrapperClasses;

public class GenericsClass {
    public static void main(String[] args) {
        Dog<String,String> obj=new Dog<>("123","Sahil");
        System.out.println(obj.getId());
        Dog<String,String> obj1=new Dog<>("123Obj","Ankit");
        System.out.println(obj1.getId());
        Dog<Integer,String> obj3=new Dog<>(123,"Sarita");
        System.out.println(obj3.getId());

        // ArrayList<Integer> a=new ArrayList<>();
    }
}
class Dog<E,V>{
   // String id;
    E id;
    V name;
    public Dog(E id,V name){
        this.id=id;
        this.name=name;
    }
    E getId(){
        return id;
    }
}
