package lesson22_Map.transleyt;

public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.loadFroamFile("EngUkr.txt");
        System.out.println(dictionary.translateToUkr("Cat"));
        /*dictionary.addEngUkrWord("Cat", "Кіт");
        dictionary.addEngUkrWord("Boy", "Хлопчик");
        dictionary.addEngUkrWord("Rice", "Рис");
        dictionary.addEngUkrWord("Milk", "Молоко");
        dictionary.addEngUkrWord("Man", "Чоловік");
        dictionary.addEngUkrWord("Woman", "жінка");
        System.out.println(dictionary.translateToUkr("Rice"));
        dictionary.addEngUkrWord("Coat", "Капелюх");
        System.out.println(dictionary.translateToUkr("Coat"));
        System.out.println(dictionary);*/




    }
}
