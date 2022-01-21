import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {
        aufgabe1();
    };
    
    // Method für erste Aufgabe
    public static void aufgabe1() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        do {
            System.out.println("Please enter a number:\n");
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                validInput = true;
                int squared = number * number;
                System.out.println(number + " squared equals to: " + squared);
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid number.\n");
            }
        } while (!validInput);
        sc.close();
    };
}
