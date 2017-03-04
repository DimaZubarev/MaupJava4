package lesson6_method;

public class Task2 {
    public static void main(String[] args) {
double griven = 100;
double usd = convert("UAH", "USD", griven);
        System.out.println(Math.round(usd*100)/100.0); //round - округляє до інта.
    }
    static double convert(String from, String to, double amount){
        double usdUah = 27.0;
        double uahUsd = 1/26.0;
        String fromTo = from + to;

        switch (fromTo){
            case "USDUAH": return amount*usdUah;
            case "UAHUSD": return amount*uahUsd;
            default : {
                System.out.println("Incorrect currency type");
                return 0;}
        }
    }
}
