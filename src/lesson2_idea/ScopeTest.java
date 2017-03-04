package lesson2_idea;

public class ScopeTest {
    public static void main(String[] args) {
        int i;
        {
            //int i;  ошибка, так как мы уже создали такую переменную. Если их поменять местами компилятор пропустит.
            int y;
            i = 50;
            y = 20;
        }
        // y = 4; // ошибка, так как у нас объявлен в блоке кода, за рамки которого он не выходит.
        i = 55;
        int y = 10; // ok
        System.out.println(i); // 55
    }
}
