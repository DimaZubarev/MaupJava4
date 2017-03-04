package test_tasck.Syntax;

public class Syntax1_B {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] number = new int[10];
//        for (int i = 0; i < number.length; i++) {
//            number[i] = scanner.nextInt();
//        }

        System.out.println(threeDigitNumbers(687));
        System.out.println(firstNumberAscending(123));
    }

    // Вивод 3х значних чисел в яких нема повторення, щось не спрацьовує
    static boolean threeDigitNumbers(int number){
       char[]simbles= Integer.toString(number).toCharArray();
            if(simbles[0]!=simbles[1] && simbles[1]!=simbles[2] && simbles[2]!=simbles[0])
                return true;
            return false;
    }

    // Вивод 3х значного числа в якому всі числа інуть на зростання
    static boolean firstNumberAscending(int number){
        char[]simbles = Integer.toString(number).toCharArray();
        if(simbles[0]<simbles[1] && simbles[1]<simbles[2])
            return true;
        return false;
    }
}
