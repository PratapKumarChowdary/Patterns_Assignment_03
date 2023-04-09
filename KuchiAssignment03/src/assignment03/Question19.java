
public class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from MyThread! using Thread Class");
    }
}

MyThread thread = new MyThread();
thread.start();


public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from MyRunnable Interface!");
    }
}

MyRunnable runnable = new MyRunnable();
Thread thread = new Thread(runnable);
thread.start();
