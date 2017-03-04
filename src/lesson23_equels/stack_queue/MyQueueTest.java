package lesson23_equels.stack_queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue();
        for (int i = 65; i < 76; i++) {
            queue.offter((char) i + " ");
            System.out.println(queue);
        }
        System.out.println(queue);
        while (!queue.isEmpty()){
            //System.out.println(queue.poll());
            queue.poll();
            System.out.println(queue);
        }
    }
}
