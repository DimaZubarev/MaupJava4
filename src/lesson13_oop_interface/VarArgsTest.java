package lesson13_oop_interface;
public class VarArgsTest {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
//        System.out.println(sum(new int[]{1,2,3,4,5,}));
        System.out.println(sum(1,2,3,4,5,6));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum (int a, int b, int c){
        return a+b+c;
    }
//    static int sum(int[]arr){
//        int sum=0;
//        for (int i : arr) {sum+=i;}
//        return sum;
//    }
    static int sum(int...arr){ //<--- var args змінна кількість аргументів
        int sum=0;
        for (int i : arr) {sum+=i;}
        return sum;
    }
//    static int sumV(int...arr, boolean b){  // int...arr - використовувати тільки останнім оргументом
//        return 0;
//    }

    static int sumV(boolean b, int... arr) { // ok!
    return 0;}

    static int sumV(String[]str, int... arr) { // ok!
    return 0;}






}
