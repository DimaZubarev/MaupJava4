package lesson3_operatorsAndCycles;

public class OperatorFor3 {
    public static void main(String[] args) {
        int i = 10;
        for (int j = 0; j < i; j++) {

            if (j == 3) continue;
            if(j == 8) break;
            System.out.println(j);
        }
    }
}
