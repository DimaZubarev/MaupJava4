package lesson17_oop.lotozabava;

public class Loto_Test {
    public static void main(String[] args) {
        Loto loto = new Loto(36);
     //   while(loto.hasNext()){
     //       System.out.println(loto.next);
     //   }
        for (int i = 0; i < 6; i++) {
            System.out.println(loto.next());
        }
    }

}
