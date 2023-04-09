public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Dog extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("Dog is barking");
    }
}

// Default to Public

public class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}
