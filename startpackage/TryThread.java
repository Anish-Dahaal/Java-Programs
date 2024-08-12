package startpackage;

class Counter {
    int count;

    public synchronized void increment() { // thread safe
        count++;
    }
}

public class TryThread {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable a = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
            }
        };

        Thread ob1 = new Thread(a);
        Thread ob2 = new Thread(b);

        ob1.start();
        ob2.start();

        ob1.join();
        ob2.join();

        System.out.println(c.count);

    }
}
