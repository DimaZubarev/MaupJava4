package test_tasck.OOPvariable6;

public class Main {
    public static void main(String[] args) {
        PhoneController controller = new PhoneController();
       // System.out.println(controller.phones);
       // controller.add(new Phone(666666, "Anton", "Seminov", "Nikopol", 000006, 6453, 543, 1750, 800));
       // System.out.println(controller.phones);
        System.out.println(controller.findById(111111));
       // System.out.println();
       // controller.sort(Phone.BY_SECOND);
       // System.out.println(controller.phones);
        System.out.println(controller.limitCityTime(1500));
        System.out.println(controller.intercityTell());

    }
}
