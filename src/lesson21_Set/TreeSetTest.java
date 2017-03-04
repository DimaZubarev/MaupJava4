package lesson21_Set;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Box> treeSet = new TreeSet<>();
        treeSet.add(new Box(64));
        treeSet.add(new Box(16));
        treeSet.add(new Box(32));
        System.out.println(treeSet);
    }
}
class Box implements Comparable<Box>{
    int value;

    public Box(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box b) {
        return Integer.compare(this.value, b.value);
    }

    @Override
    public String toString() {
        return value + " ";
    }
}