package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int a[]=new int[5];

        System.out.println("Hello Guys");
        try{
            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceptions Handled");
        }
        finally {
            System.out.println("I will runs always");
        }
        System.out.println("Bye world");
    }
}
