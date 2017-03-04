package lesson11_oop5_polymorhysm;

public class TestWorker {
    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Pavel", 1500);
        workers[1] = new Worker("Oleg", 1500);
        workers[2] = new Worker("Max", 1500);
        workers[3] = new Manager("Dima", 2500, 1000);
        workers[4] = new Manager("Anna", 2500, 750);

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }
        System.out.println(averageSalary(workers));
        System.out.println(getAverareBonus(workers));
        System.out.println(getAverageSalaryOnlyWorkers(workers));

        Worker w = new Worker("Tom", 1650);
        Worker m1 = new Manager("Tom", 1700, 500);
        Worker m2 = new Manager( "Tom", 1750, 550);

        System.out.println(m1 instanceof Manager);
        System.out.println(m1.getClass()==Manager.class); // порівнюємо клас
        System.out.println(w.getClass()==Worker.class);

        Manager[]managers = new Manager[1];
        System.out.println("managers instanceof Worker[]: " + (managers instanceof Worker[]));
        System.out.println("workers instanceof Manager[]: " + (workers instanceof Manager[]));
    }

    public static double averageSalary(Worker[] w) {
        double sum = 0;
        for (Worker worker : w) {
            sum += worker.getSalary();
        }
        return sum / w.length;
    }

    public static double getAverareBonus(Worker[] workers) {
        double sum = 0;
        int count = 0;
        for (Worker worker : workers) {
            if (worker instanceof Manager) {      // instanceof - перевіряє чи є якийсь обьєкт в масиві
                sum += ((Manager) worker).getBonus();  // ((Manager)worker) - в масиві worker шукає саме Manager
                count++;
            }
        }
        return sum / count;
    }

    public static double getAverageSalaryOnlyWorkers(Worker[] workers) {
        double sum = 0;
        int count = 0;
        for (Worker worker : workers) {
//           if (!(worker instanceof Manager)) {  // равноцінні строки
            if(worker.getClass()==Worker.class){
             sum += worker.getSalary();
               count++;
            }
        }
        return sum / count;
    }
}


