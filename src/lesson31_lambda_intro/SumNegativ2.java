package lesson31_lambda_intro;

import java.util.function.Predicate;

public class SumNegativ2 {
    public static void main(String[] args) {
        int[]a = {10, -10, -20, 20, 30, -30, -40};
        Predicate<Integer>neg = integer -> integer < 0;
        System.out.println(sumIf(a, neg));
    }
    public static int sumIf(int[]ints, Predicate<Integer> filter){
        int s = 0;
        for (int i : ints) {
            if(filter.test(i)) s+=i;
        }
        return s;
    }
}
