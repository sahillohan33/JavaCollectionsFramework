package collectionAndLists;
import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.push(1);
        System.out.println("Stack Push Element is "+stack);
        System.out.println("Top element in stack is "+stack.peek());
        while(!stack.isEmpty()){
            System.out.println("Stack Pop element is "+stack.pop());
        }

        System.out.println(stack);

    }
}
