import java.util.Scanner;

public class NameFormatter {
    public static void printName(String name) {
        // Trim any extra spaces at the beginning and end of the name
        name = name.trim();
       
        // Split the name into first name and last name
        String[] names = name.split("\\s+");
        String firstName = names[0];
        String lastName = names[1];
       
        // Format the name as "<last name>, <first name>"
        String formattedName = lastName + ", " + firstName;
       
        // Print the formatted name
        System.out.println("Formatted name: " + formattedName);
    }

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
       
        // Ask the user to enter the name
        System.out.print("Enter the name (format: <first name> <last name>): ");
        String name = scanner.nextLine();
       
        // Call the printName method with the user input
        printName(name);
       
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
