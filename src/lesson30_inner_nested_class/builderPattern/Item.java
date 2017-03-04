package lesson30_inner_nested_class.builderPattern;

public class Item {
    private int a;
    private String b;
    private char c;
    private double d;
    private boolean e;

    static Builder newBuilder(){return new Builder();}

    private Item(){} // пустий конструктор

    static class Builder{
        Item tmp = new Item();
    public Builder setA(int a) {tmp.a = a; return this;}

    public Builder setB(String b) {tmp.b = b; return this;}

    public Builder setC(char c) {tmp.c = c; return this;}

    public Builder setD(double d) {tmp.d = d; return this;}

    public Builder setE(boolean e) {tmp.e = e; return this;}

    public Item build(){return tmp;}
    }

    @Override
    public String toString() {
        return "Item{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
