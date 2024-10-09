import java.util.Scanner;

public class DisplayCharacters {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Loop through each character of the string and print it
        System.out.println("Characters in the string are:");
        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }

        // Close the scanner
        scanner.close();
    }
}
