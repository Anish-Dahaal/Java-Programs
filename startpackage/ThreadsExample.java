package startpackage;

// class A implements Runnable {
// public void run() {
// for (int i = 0; i < 10; i++)
// System.out.println("Hi");
// try {
// Thread.sleep(5);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (int i = 0; i < 10; i++)
// System.out.println("Hello");
// try {
// Thread.sleep(5);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }

public class ThreadsExample {
    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Runnable b = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }

}
