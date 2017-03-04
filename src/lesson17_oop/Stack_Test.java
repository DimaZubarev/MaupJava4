package lesson17_oop;

public class Stack_Test {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for(int i =0; i < 12; i++){
            stack.push(i+1);
        }
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
