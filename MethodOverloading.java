//Method int value addition
public class MethodOverloading {
static int plusMethod(int x, int y) {
    return x + y;
}

//Method double value addition
static double plusMethod(double x, double y){
    return x + y;
}

//Main method
public static void main(String[] args) {
    int intResult = plusMethod(5,10);
    double doubleResult = plusMethod(4.3,6.26);
    System.out.println("Integer value addition:"+ intResult);
    System.out.println("Double value addition:"+ doubleResult);
}
}