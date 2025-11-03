public class JavaThisKeyword {
    int modelYear;
    String modelName;

    public JavaThisKeyword(String modelName) {
        this(1980, modelName); // calling parameterized constructor with one static and one dynamic parameters
    }

    public JavaThisKeyword(int modelYear, String modelName) {
        this.modelName = modelName; // assigning dynamic parameter to instance variable
        this.modelYear = modelYear; // assigning dynamic parameter to instance variable
    }

    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        JavaThisKeyword car1 = new JavaThisKeyword("Ambassador"); // calling parameterized constructor with one dynamic parameter
        JavaThisKeyword car2 = new JavaThisKeyword(2000, "Tata"); // calling parameterized constructor with two dynamic parameters
        car1.printInfo();
        car2.printInfo();
    }
}