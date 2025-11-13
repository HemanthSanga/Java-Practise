class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";
    public void PrintInfo() {
        System.out.println(super.type);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.PrintInfo();
    }
}
