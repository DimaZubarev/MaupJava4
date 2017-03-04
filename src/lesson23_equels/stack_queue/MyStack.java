package lesson23_equels.stack_queue;

import java.util.LinkedList;

public class MyStack<T> {
    // lifo - last in first out / останній зайшов перший вийшов
    private LinkedList<T> items;

    public MyStack() {
        this.items = new LinkedList<>();
    }

    public void push(T item){
        items.push(item);
    }
    public T pop(){
        return  items.pop();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "items=" + items +
                '}';
    }
}
