import java.util.Stack;

public class stack_2 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        if (isPalindrome(stack)) {
            System.out.println("stack is pallindrome");
        } else {
            System.out.println("Stack is not a pallindrome");
        }
    }
    public static boolean isPalindrome(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        for (int i  :stack){
            temp.push(i);
        }
        for (int i : stack) {
            if (i != temp.pop()) {
                return false;
            }
        }
        return true;
    }
}
