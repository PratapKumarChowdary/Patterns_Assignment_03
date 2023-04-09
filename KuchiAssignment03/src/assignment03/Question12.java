public class Question12 {
    
    public static void main(String[] args) {
        final int a = 10; // final variable
        int b = 0;
        
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error: " + e.getMessage());
        } finally {
          // finally block
            System.out.println("This code block always executes."); 
        }
        
        Object obj = new Object();
        obj = null; 
        System.gc(); 
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed, cleaning up resources.");
        super.finalize();
    }
    
}
