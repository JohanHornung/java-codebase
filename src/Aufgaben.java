import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {
        // Modul 2 - Aufgaben
        // squared();

        // Modul 3 - Aufgabe - Werte über dem Durchschnitt
        // int arr[] = {1, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        // System.out.println(Arrays.toString(arr));
        // ValsOverAvg(arr);

        // Modul 3 - Aufgaben - Trennzeichen in Strings
        // String originalStrings[] = {"123456789", "1024", "237236109123"};
        // // Neues Array mit dynamischer Länge wird die modifizierten Strings enthalten
        // String modifiedStrings[] = new String[originalStrings.length]; 
        
        // for (int i = 0; i < originalStrings.length; i++) {
        //     String modifiedString = stringModifier(originalStrings[i]);
        //     modifiedStrings[i] = modifiedString;
        // }    
        // printing modified Strings
        // System.out.println(Arrays.toString(modifiedStrings));
    };
    
    // Methode für Modul 2
    public static void squared() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        do {
            System.out.println("Please enter a number:\n");
            String input = sc.nextLine(); // System.console().readLine()
            try {
                float number = Float.parseFloat(input);
                validInput = true;
                // int squared = number * number;
                System.out.println(number + " squared equals to: " + number * number);
            } catch (NumberFormatException e) { 
                System.out.println("This is not a valid number.\n");
            }
        } while (!validInput); // validInput == False
        sc.close();
    };
    // Methode für Modul 3
    public static void ValsOverAvg(int[] arr) {
        int n = arr.length;
        int sum = 0;
        // dynamic array for values over average
        ArrayList<Integer> ValsOverAvg = new ArrayList<>();
        // Durchschnitt wird ausgerechnet
        for (int elem : arr) {
            sum += elem;
        }
        float avg = sum / n;
        System.out.println("Der Durchschnitt des Arrays ist: " + avg);
        // Test ob Element im Array über dem Durchschnitt liegt
        for (int i = 0; i < n; i++) {
            // Element wird dem Output Array hinzugefügt
            if (arr[i] > avg) {
                System.out.println(arr[i] + " ist über dem Durchschnitt");
                ValsOverAvg.add(arr[i]);
            }
        }
        System.out.println(ValsOverAvg);
        // return ValsOverAvg;
    };
    // Methode für Modul 3
    public static String stringModifier(String string) {       
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
    };
    
}
