package ExceptionHandling;

public class tryandCatch {
    public static void main(String[] args) {
        int a[]=new int[5];
        try {
            int b=5/0;
            System.out.println(a[8]);
            System.out.println("Hello guys");
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Handling exception");

        }

    }
}
