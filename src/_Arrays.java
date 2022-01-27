import java.util.Arrays;

public class _Arrays {
    public static void main(String[] args) {
        // Übung 1 - Definieren Sie einen Array von charsin dem „Hello World“ steht.
        char[] charArray = "Hello World".toCharArray(); // "\n" werden berücksichtigt
        // System.out.println(charArray);
        // Ersetzen Sie in ihrem Wort alle „e“s durch „ä“s.
        for (int i = 0; i < charArray.length; i++) {
            // REMINDER: '' --> char, "" --> String
            if (charArray[i] == 'e') charArray[i] = 'ä';
        }
        // System.out.println(charArray);
        
        // Übung 2 - Füllen Sie in einen int[100] die Zahlen von 1 bis 100.
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) intArray[i] = i + 1;
        // printing
        System.out.println(Arrays.toString(intArray));
        // Füllen Sie in einen int[10] die Zahlen von 1000 bis 1009
        int[] intArray1 = new int[10];
        for (int i = 0; i < intArray1.length; i++) intArray1[i] = 1000 + i;
        // printing
        System.out.println(Arrays.toString(intArray1));
    }
}
