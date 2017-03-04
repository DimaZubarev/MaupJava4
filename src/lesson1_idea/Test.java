package lesson1_idea;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Вывод сплюсованых чисел: " + i+i); //
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i+i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + (i + " "));
        }


    }
}
