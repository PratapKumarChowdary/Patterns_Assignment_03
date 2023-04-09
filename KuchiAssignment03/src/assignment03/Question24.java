public class GarbageCollectorExample {
    public static void main(String[] args) {
        // create an object
        Object obj = new Object();
        
        // set the reference to null to make it eligible for garbage collection
        obj = null;
        
        // call the garbage collector explicitly
        System.gc();
        
        // wait for some time to let the garbage collector do its job
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Garbage collected");
    }
}
