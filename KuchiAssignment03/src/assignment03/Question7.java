public class MyClass {
  public final MyClass() {
    // constructor implementation
    System.out.println("Final Consructor");
  }
}


public class MainClass{
  public static void main(String args[]){
    
    MyClass class = new MyClass();
  }
  
}



// error: modifier final not allowed here
//  public final MyClass() {
                 ^

