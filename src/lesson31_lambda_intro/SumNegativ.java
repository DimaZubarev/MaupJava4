package lesson31_lambda_intro;
public class SumNegativ {
    public static void main(String[] args) {
        int[]a = {10, -10, -20, 20, 30, -30};
        System.out.println(sumNegative(a, n -> n<0));

        Func upper = s -> s.toUpperCase();
        String str = upper.apply("abcd");
        System.out.println(str);
    }
    public static int sumNegative(int[]ints, MyFilter filter){
        int s = 0;
        for (int i : ints) {
            if(filter.test(i)) s+=i;
        }
        return s;
    }

}
