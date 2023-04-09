public class SuperClass {
    public static void myStaticMethod() {
        System.out.println("SuperClass: myStaticMethod");
    }
    
    private void myPrivateMethod() {
        System.out.println("SuperClass: myPrivateMethod");
    }
}

public class SubClass extends SuperClass {
    public static void myStaticMethod() {
        System.out.println("SubClass: myStaticMethod");
    }
    
    private void myPrivateMethod() {
        System.out.println("SubClass: myPrivateMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        SuperClass obj2 = new SubClass();
        
        obj1.myStaticMethod(); 
        obj2.myStaticMethod(); 
        
      // Not accessible from outside the SuperClass
        obj1.myPrivateMethod(); 
        obj2.myPrivateMethod(); 
    }
}
