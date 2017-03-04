package lesson31_lambda_intro;

import java.util.function.BiFunction;
import java.util.function.Function;

public class OtherLambdas {
    public static void main(String[] args) {
        Function<String, Integer> len;
        len = (s1) -> s1.length(); // String::length - method refference.

        Function<String, String> len2 = s ->  s + "A";
        Function<String, String> len3 = s ->  s + "B";
        Function len4 = len2.compose(len3);
        System.out.println(len4.apply("abcd"));

        System.out.println(len.apply("abcd"));
        BiFunction<String, String, String> concat;
        concat = (s, s2) -> s + s2;

    }
}
