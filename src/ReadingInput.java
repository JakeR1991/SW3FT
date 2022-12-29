import java.util.Scanner; // Importing scanner class to create user input

public class ReadingInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input and save to variable called username
        System.out.println("Enter password");
        String password = myObj.nextLine();  // Read user input and save to variable called password
        System.out.println("Username is: " + userName);  // Print user input
        System.out.println("Password is: " + password);  // Print user input

    }
}
