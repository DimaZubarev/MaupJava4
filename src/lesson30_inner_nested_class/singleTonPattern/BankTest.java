package lesson30_inner_nested_class.singleTonPattern;

public class BankTest {
    public static void main(String[] args) {
        Bank.initBank("Golden Bank");
        Bank bank1 = Bank.getInstance();

        Bank.initBank("Silver Bank");
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1);
        System.out.println(bank2);
    }
}
