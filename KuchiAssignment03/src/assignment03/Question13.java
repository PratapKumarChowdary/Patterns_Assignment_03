import java.util.ArrayList;
import java.util.Vector;

public class Question13 {
    
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<>();
        vector.add("Pratap");
        vector.add("Kumar");
        vector.add("Kuchi");
        
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("NTR");
        arrayList.add("NBK");
        arrayList.add("NKR");
        
        // Print the contents of the Vector and ArrayList
        System.out.println("Vector:");
        for (String s : vector) {
            System.out.println(s);
        }
        
        System.out.println("\nArrayList:");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
    
}
