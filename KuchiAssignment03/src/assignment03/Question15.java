import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Question15 {
    public static void main(String[] args) {
        
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pratap", 25);
        hashMap.put("Kumar", 30);
        hashMap.put("Kuchi", 35);
        System.out.println("HashMap: " + hashMap);
        
        // Creating a Hashtable
        Map<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("Jim", 25);
        hashTable.put("Victor", 30);
        hashTable.put("Dean", 35);
        System.out.println("Hashtable: " + hashTable);
    }
}
