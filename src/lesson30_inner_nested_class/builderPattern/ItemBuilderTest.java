package lesson30_inner_nested_class.builderPattern;
public class ItemBuilderTest {
    public static void main(String[] args) {
        Item item = Item.newBuilder().setA(42).setB("abc").setC('a').setD(1.1).setE(true).build();
        System.out.println(item);
        System.out.println(item instanceof  Item);
        System.out.println(item.getClass());
    }
}
