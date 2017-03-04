package lesson20_List.practic;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {this.accounts = new ArrayList<>();}

    public void add(Account account){
        accounts.add(account);
    }

    public void setBalance(int index, double money){
        accounts.get(index).setBalance(money);
    }
    public List<Account> getAllAccounts(){
        List<Account> tmp = new ArrayList<>();
        for (Account account : accounts) {
            tmp.add(new Account(account));
        }
        return tmp;
    }
    public List<Account> getPositiveAccounts(){
        List<Account> tmp = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getBalance() >= 0) tmp.add(new Account(account));
        }
        return tmp;
    }

}
