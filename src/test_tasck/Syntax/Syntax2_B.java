package test_tasck.Syntax;

import java.util.Random;

public class Syntax2_B {
    public static void main(String[] args) {
        int[]number = new int[50];
        // заповнення масиву рандомними числами
        Random random = new Random();
        for (int i = 0; i < number.length ; i++) {
            number[i] = random.nextInt(100+ 1);
        }

    }

}

