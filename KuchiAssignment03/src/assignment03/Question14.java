
public class Question14 {
    public static void main(String[] args) {
      
      
      List<String> list = new ArrayList<String>();
      List<String> synchronizedList = Collections.synchronizedList(list);
      
      List<String> list = new CopyOnWriteArrayList<String>();
      
      
    }
}
