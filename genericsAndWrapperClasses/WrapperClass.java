package genericsAndWrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a=new Integer(3);
        Integer obj=Integer.valueOf(12);
        System.out.println(obj*5);
        Integer obj3=12;  // autoBoxing
        Integer age=obj; // unboxing
    }
}
