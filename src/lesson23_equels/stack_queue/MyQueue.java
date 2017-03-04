package lesson23_equels.stack_queue;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> items;

    // Конструктор це статичний метод - тому що конструктор запускається до запуску программи.
    public MyQueue() {
        this.items = new LinkedList<>();
    }
    public void offter(T item){
        items.offer(item);
    }
    public T poll(){
        return items.poll();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "items=" + items +
                '}';
    }
}
