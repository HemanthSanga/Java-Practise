class OutsideClass { // Outer Class
    int x = 10;
    class InsideClass { // Inner Class
        int y = 20;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OutsideClass outer = new OutsideClass();
        OutsideClass.InsideClass inner = outer.new InsideClass();
        System.out.println("The Sum of of x and y is: " + (outer.x+ inner.y)); // Accessing members of both classes
    }
}
