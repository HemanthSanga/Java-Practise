import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner inputField = new Scanner(System.in);
        System.out.println("User, please provide your House name: ");
        String houseName = inputField.nextLine();
        System.out.println("The provided House name is: " + houseName);
        inputField.close();    
    }
}
