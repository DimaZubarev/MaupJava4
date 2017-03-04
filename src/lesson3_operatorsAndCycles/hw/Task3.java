package lesson3_operatorsAndCycles.hw;

public class Task3 {
    public static void main(String[] args) {
        // var1
        int i = 5;
        int delta = 1;
        int len = 0;

        for (int j = 0; j < i * 2; j++) {
            len += delta;
            for (int k = 0; k < len; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(j>= i-1) delta =-1;
        }
        
        // var2
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
//              ?????????
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
