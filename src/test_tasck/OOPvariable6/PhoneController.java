package test_tasck.OOPvariable6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dimon on 30.12.2016.
 */
public class PhoneController implements Function{



    List<Phone> phones = new ArrayList<>(); // Коли потрібно в двух косих дужках писати типи змінних?

    public PhoneController(){
        phones.add(new Phone(111111, "Dima", "Zub", "Kyiv", 000001, 563, 35, 1000, false));
        phones.add(new Phone(222222, "Tom", "Cat", "Dnepr", 000002, 569, 351, 1500, false));
        phones.add(new Phone(333333, "Djery", "Mouse", "Lviv", 000003, 579, 391, 1500, true));
        phones.add(new Phone(444444, "Bob", "Bobkins", "Omaxa", 000004, 843, 500, 1200, false));
        phones.add(new Phone(555555, "Bim", "Bimov", "Denver", 000005, 769, 550, 1600, true));
    }
    @Override
    public boolean add(Phone phone) {
        phones.add(phone);
        return true;
    }

    @Override
    public boolean delete(Phone phone) {
        phones.remove(phone);
        return true;
    }

    @Override
    public Phone findByName(String firstName) {
        for (Phone phone : phones) {
            if(phone.getFirstName()== firstName) return phone;
        }
        return null;
    }

    @Override
    public Phone findById(int id) {
        for (Phone phone : phones){
            if (phone.getId() == id) return phone;
        }
        return null;
    }
    public void sort(Comparator<Phone> c){
        phones.sort(c);
        // null - сортировка по умолчанию с Phone
    }
    public List<Phone> limitCityTime(int limit){
        List<Phone> tmp = new ArrayList<>();
        for (Phone phone : phones) {
           if(phone.getCityTime()>=limit)
               tmp.add(phone);
        }
        return tmp;
    }
    public List<Phone> intercityTell(){
        List<Phone> tmp = new ArrayList<>();
        for (Phone phone : phones) {
            if(phone.getIntercityTime()== true)
                tmp.add(phone);
        }
        return tmp;
    }

}
