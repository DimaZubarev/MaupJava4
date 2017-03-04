package lesson11_oop5_polymorhysm;
public class Manager extends Worker{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+ this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name= " + getName() + '\'' +
                ", salary= " + getSalary() + "(" +
                super.getSalary() + " + " +
                this.bonus + ")" + '}';
    }
}
