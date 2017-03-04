package lesson4_arrays;

public class ArrayForeach {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i <num.length ; i++) {
            num[i] = i;
        }
        for (int item:num) {
            System.out.print(item + " ");
        }

    }

}
