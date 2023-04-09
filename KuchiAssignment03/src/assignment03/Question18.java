public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        t.start(); // start the thread for the first time
        t.start(); // try to start the thread for the second time
      // It will throw exception
    }
}
