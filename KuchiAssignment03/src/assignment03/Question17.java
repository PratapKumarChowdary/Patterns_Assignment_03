import java.util.*;

public class IteratorDemoQuestion17 {
    public static void main(String[] args) {
     
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

       
        Iterator<Integer> iterator = list.iterator();

       
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
            // add a new element while iterating
            list.add(6);
        }

   
        Iterator<Integer> safeIterator = new CopyOnWriteArrayList<>(list).iterator();

        while (safeIterator.hasNext()) {
            int element = safeIterator.next();
            System.out.println(element);
            // adding a new element while iterating
            list.add(7);
        }
    }
}
