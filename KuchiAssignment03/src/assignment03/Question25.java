// For Each Example

List<String> list = new ArrayList<>();
list.add("apple");
list.add("banana");
list.add("orange");

list.forEach(item -> System.out.println(item));


// B.	default and static methods in Interfaces

interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    // Overrides the default implementation
    @Override
    public void defaultMethod() {
        System.out.println("This is a custom implementation.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod(); // Output: This is a custom implementation.
        MyInterface.staticMethod(); // Output: This is a static method.
    }
}


// C.	Functional Interfaces and Lambda Expressions

@FunctionalInterface
interface MyFunction {
    int apply(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        MyFunction addFunction = (x, y) -> x + y;
        int result = addFunction.apply(5, 3); // result = 8
    }
}

// Java Stream API

List<String> names = Arrays.asList("John", "Mary", "Peter", "Lucy", "David");

// Using the filter and map operations to get the names starting with 'J' and convert them to uppercase
List<String> filteredNames = names.stream()
                                  .filter(name -> name.startsWith("J"))
                                  .map(name -> name.toUpperCase())
                                  .collect(Collectors.toList());
// E.	Java Time API

LocalDateTime now = LocalDateTime.now();
System.out.println("Current date and time: " + now);

LocalDate date = now.toLocalDate();
System.out.println("Current date: " + date);

LocalTime time = now.toLocalTime();
System.out.println("Current time: " + time);

ZoneId zone = ZoneId.systemDefault();
ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zone);
System.out.println("Current date and time with timezone: " + zonedDateTime);

