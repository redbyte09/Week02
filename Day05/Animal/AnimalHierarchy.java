class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Constructor
    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " the Dog makes sound: Woof Woo!");
    }
}

class Cat extends Animal {
    // Constructor
    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " the Cat makes sound: Meow Meow!");
    }
}

class Bird extends Animal {
    // Constructor
    Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " the Bird makes sound: cu cu!");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Animal dog = new Dog("Addy", 1);
        Animal cat = new Cat("Whis", 2);
        Animal bird = new Bird("Tweety", 1);

        // Calling makeSound for each object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
