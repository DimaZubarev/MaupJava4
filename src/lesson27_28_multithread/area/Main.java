package lesson27_28_multithread.area;

public class Main {
    public static void main(String[] args) {
//        SquareThread st = new SquareThread();
//        CircleThread ct = new CircleThread();
        new SquareThread().start();
        new CircleThread().start();
//        st.start();
//        ct.start();
    }
}
