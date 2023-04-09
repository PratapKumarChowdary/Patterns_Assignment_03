import java.io.*;

public class SerializationDemo {
   public static void main(String[] args) {
      // Create an object to be serialized
      Person person = new Person("John", 30);
      
      try {
         // Serialize the object
         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
         out.writeObject(person);
         out.close();
         
         // Deserialize the object
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
         Person deserializedPerson = (Person)in.readObject();
         in.close();
         
         // Verify the deserialized object
         System.out.println("Deserialized Person: " + deserializedPerson);
         
      } catch(IOException e) {
         e.printStackTrace();
      } catch(ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
}

// Person class that implements Serializable
class Person implements Serializable {
   private String name;
   private int age;
   
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public String getName() {
      return name;
   }
   
   public int getAge() {
      return age;
   }
   
   public String toString() {
      return "Person [name=" + name + ", age=" + age + "]";
   }
}
