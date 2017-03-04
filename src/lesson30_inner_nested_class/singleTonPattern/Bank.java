package lesson30_inner_nested_class.singleTonPattern;

public class Bank {
    private static  Bank instance;
    static void initBank(String name){
        if(instance == null) instance = new Bank(name);
    }

    public static Bank getInstance() {
        return instance;
    }

    private final String name;

    private Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
