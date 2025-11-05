import java.util.Scanner;

public class Scanner_exe {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");
        
        String userName = myObj.nextLine();
        System.out.println("Your input is: " + userName);

        myObj.close();
    }
}
