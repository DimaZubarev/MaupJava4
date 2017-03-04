package lesson20_List.IntroGenerik;

/**
 * Created by Dimon on 06.01.2017.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(new String[]{"AB", "CD", "EF"});
        System.out.println(box1);
        Box box2 = new Box(new Integer[]{1,2,3});
        System.out.println(box2);
        //problem 1 - storing anything!!! Integer, String, ...
        box2.setN("AA", 0);
        System.out.println("Box2 = "+ box2);
        //problem 2 - downcasting (преведение к) + problem 3(from 1) - runtime errors
        Integer a = (Integer) box2.getN(0) + (Integer)box2.getN(1);

    }
}
