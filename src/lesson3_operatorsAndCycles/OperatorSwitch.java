package lesson3_operatorsAndCycles;

public class OperatorSwitch {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int month = sc.nextInt();
        int month = (int) (Math.random()* 13 + 1);
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "осінь";
                break;
                default:
                    season = "Да фіг його знає";
        }
        System.out.println(month + "й місяць це " + season);
    }
}
