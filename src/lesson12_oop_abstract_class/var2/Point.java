package lesson12_oop_abstract_class.var2;
public abstract class Point {
    private String color;

    public Point(String color) {
        this.color = color;
    }

    public abstract void show();
    // Нащадки обов'язково повинні реалізувати цей метод, або самі повинні об'явити себе абстрактними.
    // Неможливо створити обьєкт абстрактного класу
}
