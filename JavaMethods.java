/*Java Methods example */

public class JavaMethods {     /*The class name JavaMethods should be same as the file JavaMethods.java*/
    static void myMethod(String fname, int age) { /*Static method named myMethod with parameters fname and age*/
        System.out.println(fname + " Sanga" + " is " + age + " years old.");
    }

    static void checkAge(int age) { /*Static method named checkAge to check age*/
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int addNumbers(int a, int b) { /*Static method named addNumbers that returns the sum of two integers*/
        return a + b;
    }   
    public static void main(String[] args) {
        myMethod("Ranganath", 61);
        myMethod("Indira", 53);
        myMethod("Ruthwik", 32);
        myMethod("Amulya", 29);
        myMethod("Vihaan", 1);
        myMethod("Hemanth", 30);

        checkAge(20); // Call the method with age 20

        System.out.println("Sum of 5 and 10 is: " + addNumbers(5, 10)); // Call the method and print the result
    }

    
}
