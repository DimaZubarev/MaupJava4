package lesson17_oop;

public class Stack {
    private int[]items;
    private int maxSize;
    private int index;

    public Stack(int m) {
        this.maxSize = m;
        this.items = new int[maxSize];
        this.index = -1;
    }
    // розширення масиву
    public void push(int item){
        if(index<maxSize-1){
            index++;
            items[index] = item;
        }else System.out.println("Failed to push item " + item);
    }
    public int pop(){
        return items[index--];
    }
    public boolean isEmpty(){
        return (index<0);
    }
}
