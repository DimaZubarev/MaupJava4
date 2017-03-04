package lesson5;

public class Task5_1 {
    public static void main(String[] args) {
        String fio = "Dima Zubarev Nikolayovich";
        String firstName = fio.substring(0, 4);
        String lastName = fio.substring(5, 12);
        String patronymic = fio.substring(13, 25);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(patronymic);
    }


}
