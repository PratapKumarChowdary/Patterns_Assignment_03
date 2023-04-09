import java.util.HashMap;

public class Question16 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();

      
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

 
        int age = hashMap.get("Bob");
        System.out.println("Bob's age is " + age);

    
    }
}
