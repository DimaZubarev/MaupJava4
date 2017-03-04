package lesson27_28_multithread;

import java.util.Scanner;

public class AskMeNumberTest {
    public static void main(String[] args) throws InterruptedException{

    AskMeNumber amn = new AskMeNumber();
        amn.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to get number");
        sc.nextLine();
        //amn.setStop(true);
        amn.interrupt();
        System.out.println(amn.getCount());
    }

}
