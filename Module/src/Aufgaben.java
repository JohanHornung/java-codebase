import java.util.Scanner;
// Interface die eine Reihe von Test von angegebener method durchführt
interface Test {
    String exec(String[] input);
}
public class Aufgaben {
    public static void main(String[] args) {
        // Modul 2 - Aufgaben
        // squared();
        
        // Modul 3 - Aufgaben
        // String originalStrings[] = {"123456789", "1024", "237236109123"};
        // for (String originalString: originalStrings) {
        //     String modifiedString = aufgabe2(originalString);
        //     System.out.println(modifiedString);
        // }
    };
    
    // Methode für erste Aufgabe
    public static void squared() {
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

    public static String aufgabe2(String string) {
        // Vorerst leere Kopie da Strings in Java unveränderbar sind
        String newString = "";
        int n = string.length();
        for (int i = n - 1; i >= 0; i--) {
            // Der Kopie wird char pro char (vom Original) erweitert
            newString += string.charAt(n - i - 1);
            // Nach jeder dritt-letzen Zahl (außer am Ende des strings) wird ein Punkt hinzugefügt
            if (i % 3 == 0 && i != 0) newString += "."; // newString = newString + ".";
        }
        return newString;
    }
}
