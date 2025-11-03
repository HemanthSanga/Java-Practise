public class Methods {
    int carYear;
    String chasisNumber;

    public void specifications() {
        System.out.println("The car make is Ambassador and runs on diesel.");
    }

    public Methods(int year, String chasis) { // Constructor with parameters
        carYear = year; // Constructor to initialize carYear variable
        chasisNumber = chasis; // Initialize chasisNumber variable
    }
    
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Methods myCar = new Methods(1965, "AMB1234567"); // Create a myCar object and passing values to the constructor
        myCar.specifications(); // Call the specifications method
        myCar.fullThrottle(); // Call the fullThrottle method
        myCar.speed(200); // Call the speed method
        System.out.println("Car year is: " + myCar.carYear); // Access carYear variable with the object through constructor
        System.out.println("Chasis Number is: " + myCar.chasisNumber); // Access chasisNumber variable with the object through constructor
    }
}
