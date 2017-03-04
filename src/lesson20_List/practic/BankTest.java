package lesson20_List.practic;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new Account("A", 1000));
        bank.add(new Account("B", -1000));
        bank.add(new Account("C", 2000));
        bank.add(new Account("D", -2000));
        bank.add(new Account("E", 3000));
        bank.add(new Account("F", -3000));
        System.out.println(bank.getAllAccounts());
        System.out.println(bank.getPositiveAccounts());
//        System.out.println("Є така загроза!!!");
//        bank.getPositiveAccounts().get(1).setBalance(50000);
        System.out.println(bank.getPositiveAccounts());
    }
}
