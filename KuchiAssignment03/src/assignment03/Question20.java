public class ThreadStatesEx implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadStates());

        System.out.println("Thread state before starting: " + thread.getState());

        thread.start();
        System.out.println("Thread state after starting: " + thread.getState());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after sleeping for 1 second: " + thread.getState());
    }
}
