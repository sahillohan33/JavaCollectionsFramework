package genericsAndWrapperClasses;

public class GenericsMethod {
    public static void main(String[] args) {
        printData("Hello");
        printData(21);
        GenericsMethod obj=new GenericsMethod();
       // obj.doubleData("Method");
        obj.doubleData(123);
    }
    static <E>  void printData(E data){
        System.out.println(data);
    }
    <E extends Number> void doubleData(E data){
        System.out.println(data);

    }
}
