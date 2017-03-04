package lesson11_oop5_polymorhysm;

/**
 * Created by Dimon on 14.12.2016.
 */
public class B extends A {
    int a = 5; // ховає данні для класу А

    @Override
    public int getA() {
        return a;      // this.a
    }

    public int getAA(){
        return super.a + this.a;
    }
}
