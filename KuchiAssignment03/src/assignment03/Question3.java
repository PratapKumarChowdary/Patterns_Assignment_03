public class Animal {
    public Animal getAnimal() {
        return new Animal();
    }
}

public class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
