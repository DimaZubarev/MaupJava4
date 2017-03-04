package lesson2_idea;

public class NumSystems {
    public static void main(String[] args) {
        int i10 = 22;
        int i16 = 0xF;
        int i8 = 010;
        int i2 = 0b111;

        int number = 15;
        String str = Integer.toString(number, 16);
        System.out.println("16: " + str);

        str = Integer.toString(number, 8);
        System.out.println("8: " + str);

        str = Integer.toString(number, 2);
        System.out.println("2: " + str);

        System.out.println("i2 = " + i2);
        System.out.println("i8 = " + i8);
        System.out.println("i10 = " + i10);
        System.out.println("i16 = " + i16);






    }
}
