package lesson30_inner_nested_class;
public class AnonimusClasses {
    public static void main(String[] args) {
       // 1 inherit from class B
        B b = new B(1){   // 1) class "" extends B. 2) new ""
            void m2(){
                System.out.println("m2");
            }

            @Override
            void m() {
                System.out.println("m of anonymous class");
            }
        };
        b.m();
        // 2 implement interface
        C c = new C() {              // 1) class "" implements C. 2) new ""
            @Override
            public void c() {
                System.out.println("method c in anonymous class");
            }
        };
    }

}
class B{
    int b;

    public B(int b) {
        this.b = b;
    }

    void m(){

    }
}
interface C {
    void c();
}

