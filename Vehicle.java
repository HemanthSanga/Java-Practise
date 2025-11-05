//Inheritance Concept Example

class Vehicle {
    protected String brand = "Hindustan Private Limited"; // Vehicle attribute

    public void showBrand() { // Vehicle method
        System.out.println("You requested the below Brand and Model.");
    }
}

class Car extends Vehicle {
    private String modelName = "Ambassador"; // Car attribute

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showBrand(); // Call the method from the Vehicle class
        System.out.println("Brand: " + myCar.brand + ", Model: " + myCar.modelName);
    }
}
