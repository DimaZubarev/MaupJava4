package test_tasck.OOPvariable6;

import java.util.Comparator;

public class Phone implements Comparable<Phone>{

    private int id;
    private String firstName;
    private String secondName;
    private String city;
    private int idCard;
    private int debet;
    private int credit;
    private int cityTime;
    private boolean intercityTime;

    public Phone(int id, String firstName, String secondName, String city, int idCard, int debet, int credit,
                 int cityTime, boolean intercityTime) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
        this.idCard = idCard;
        this.debet = debet;
        this.credit = credit;
        this.cityTime = cityTime;
        this.intercityTime = intercityTime;
    }

    @Override
    public int compareTo(Phone p) {
        return p.getSecondName().compareTo(p.getSecondName());
    }
    static Comparator <Phone> BY_SECOND = new Comparator<Phone>() {
        @Override
        public int compare(Phone o1, Phone o2) {
            return o1.getSecondName().compareTo(o2.getSecondName());
        }
    };

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCity() {
        return city;
    }

    public int getIdCard() {
        return idCard;
    }

    public int getDebet() {
        return debet;
    }

    public int getCredit() {
        return credit;
    }

    public int getCityTime() {
        return cityTime;
    }

    public boolean getIntercityTime() {
        return intercityTime;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", city='" + city + '\'' +
                ", idCard=" + idCard +
                ", debet=" + debet +
                ", credit=" + credit +
                ", cityTime=" + cityTime +
                ", intercityTime=" + intercityTime +
                '}';
    }


}
