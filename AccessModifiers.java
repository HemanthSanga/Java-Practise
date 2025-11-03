class Person {
    public String name = "John";
    public int age = 30;
}

public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
    }
}