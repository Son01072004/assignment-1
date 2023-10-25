import java.util.Stack;

public class StackADT {
    // pushing element on top of the stack
    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i <= 10; i++){
            stack.push(i);
        }
        System.out.println("Stack push : " + stack);
    }
    //popping element from top of the stack
    public static void stackPop(Stack<Integer> stack){
        int element = stack.pop();
        System.out.println("Element pop : " + element);
        System.out.println("Stack pop : " + stack);
    }
    //Displaying element on the top of th stack
    public static void stackPeek(Stack<Integer> stack){
        int element = stack.peek();
        System.out.println("Element peek : " + element);
    }

    public static void stackSearch(Stack<Integer> stack, int value){
        int element = stack.search(value);
        if (element == -1) {
            System.out.println(value + " cannot find in the stack");
        } else {
            System.out.println(value + " is found at position " + element);
        }
    }

    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if(result){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public static void stackSize(Stack<Integer> stack){
        int element = stack.size();
        System.out.println("Stack size : " + element);
        System.out.println(stack);
    }
}
