package lesson23_equels.stack_queue;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        for (int i = 65; i < 76; i++) {
            stack.push((char) i + " ");
            System.out.println(stack);
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            //System.out.println(stack.pop());
            stack.pop();
            System.out.println(stack);
        }
    }
}
