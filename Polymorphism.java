//Polymorphism Example File

class Animal {
    public void animalsound() {
        System.out.println("Each animal makes a different sound");
    }
}

class Dog extends Animal {
    public void animalsound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    public void animalsound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog();       // Create a Dog object
        Animal myCat = new Cat();       // Create a Cat object
        myAnimal.animalsound();
        myDog.animalsound();
        myCat.animalsound();
    }
}
