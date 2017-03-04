package lesson2_idea;

public class TestString {
    static String str1 = "Java";
    static String str2 = "Javascript";
    static String str3 = "dima";
    static String str4= "Dima";

    public static void main(String[] args) {

        // определяет какой по счету будет буква встретившись в первый раз, если нужной буквы нет, то выдаст -1
        System.out.println(str1.indexOf('a'));
        System.out.println(str2.indexOf("a"));

        // начинает счет после указанного индекса
        System.out.println(str1.indexOf('a', 3));
        System.out.println(str2.indexOf('c', 3));

        // определяет какой по счету будет в последней раз встречена
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str2.lastIndexOf('a'));

        // выводит длинну или количество символов
        System.out.println(str1.length());
        System.out.println(str2.length());


        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4)); // проверяет содержимое не обращая внлимания на заглавные

    }


}
