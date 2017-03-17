package core.multithreading.monitor;

public class App00 {
    public static synchronized void main(String[] args) throws InterruptedException {
        new Object().notify();
    }
}
