//  Java Abstraction example. 
abstract class Animal {
    public abstract void animalsound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
class Pig extends Animal {
    public void animalsound() {
        System.out.println("The pig says: wee wee");
    }
}
public class JavaAbstraction {
    public static void main(String[] args) {
        Pig mypig = new Pig(); // Create a Pig object
        mypig.animalsound();
        mypig.sleep();
    }
}
