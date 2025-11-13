enum Level { // Java Enum class example
    LOW,
    MEDIUM,
    HIGH
}

public class JavaEnum {
    public static void main(String[] args) {
        Level intense = Level.MEDIUM; // Set enum variable
        
        switch (intense) {
            case LOW:
                System.out.println("The stress level in the boiler is: " + intense);
                break;
            case MEDIUM:
                System.out.println("The stress level in the boiler is: " + intense);
                break;
            case HIGH:
                System.out.println("The stress level in the boiler is: " + intense);
        }
    }
}
