// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {
        // Modul 2 - Aufgaben
        // squared();

        // Modul 3 - Aufgabe - Werte über dem Durchschnitt
        // int arr[] = {1, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        // ValsOverAvg(arr);
        // System.out.println(Arrays.toString(arr));

        // Modul 3 - Aufgaben - Trennzeichen in Strings
        // String originalStrings[] = {"12345678", "1024", "237236109123", "1234"};
        // // Neues Array mit dynamischer Länge wird die modifizierten Strings enthalten
        // String modifiedStrings[] = new String[originalStrings.length]; 
        
        // for (int i = 0; i < originalStrings.length; i++) {
        //     modifiedStrings[i] = stringModifier(originalStrings[i]);
        // }
        // System.out.println(Arrays.toString(modifiedStrings));
        // System.out.println(findE("string"));
        // System.out.println(findE("Hello world"));
        breakpointTrigger();
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
        // Summe von Elementen
        for (int e : arr) {
            sum += e;
        }
        // Durchschnitt wird ausgerechnet
        float avg = sum / n;
        System.out.println("Der Durchschnitt des Arrays ist: " + avg);
        // Test ob Element im Array über dem Durchschnitt liegt
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i] + " ist über dem Durchschnitt");
            }
        }
    };
    
    // Methode für Modul 3
    public static String stringModifier(String string) {       
        // Vorerst leere Kopie da Strings in Java unveränderbar sind
        String newString = "";
        int n = string.length();
        
        for (int i = 0; i < n; i++) {
            // Die Kopie wird char pro char (vom Original) erweitert
            newString += string.charAt(i);
            // Punkt-Setzung von rechts nach links
            int reversedIndex = n - 1 - i;
            
            // Nach jeder dritt-letzten Zahl (außer am Ende des strings) wird ein Punkt hinzugefügt
            if (reversedIndex % 3 == 0 && reversedIndex != 0) newString += '.'; // newString = newString + ".";
        }
        return newString;
    };
    // Pseudo code implementierungsbeispiel
    public static int findE(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') return i;
        }
        return -1;
    }
    // Breakpoint Übung
    public static void breakpointTrigger() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    
}
