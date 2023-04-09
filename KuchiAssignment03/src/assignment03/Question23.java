public final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        final ImmutableClass immutable = new ImmutableClass(10);
        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 1: " + immutable.getValue());
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 2: " + immutable.getValue());
            }
        });
        
        t1.start();
        t2.start();
    }
}
