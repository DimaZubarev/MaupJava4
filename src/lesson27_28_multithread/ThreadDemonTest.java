package lesson27_28_multithread;
public class ThreadDemonTest {
    public static void main(String[] args) throws InterruptedException{
        ThreadDemon thread = new ThreadDemon();
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            Thread.sleep(500);}
        System.out.println("Main end");
    }
}
