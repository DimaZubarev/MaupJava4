package lesson17_oop.lotozabava;

import java.util.Random;

public class Loto {
    private int count; // кількість
    private int index;
    private int[] numbers;

    public Loto(int count) {
        this.count = count;
        this.index = -1;
        this.numbers = new int[count];
        for(int i = 0; i<count; i++){numbers[i] = i+1;}
        shuffle();
    }

    private void reset(){
      shuffle();
      index =-1;
    }
    // перемішування готового масиву
    private void shuffle() {
        int j, tmp;
        for (int i = 0; i < count; i++) {
            j  = (int)(Math.random()*count);
            tmp = numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=tmp;
        }
    }
    public int next(){
        return numbers[++index];
    }
    public boolean hasNext(){
        return (index<count-1);
    }
}
