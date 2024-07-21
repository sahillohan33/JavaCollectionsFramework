package ExceptionHandling;

import java.util.Scanner;

class MyExceptions extends Exception{
    public MyExceptions(String Message){
        super(Message);
    };
}
public class CustomExceptions {
    public static void main(String[] args) //throws MyExceptions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        try {
            int age = sc.nextInt();
            if (age > 100) {
               // throw new MyExceptions("My Error is this");
                throw new ArithmeticException("More than 100 not allowed");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

