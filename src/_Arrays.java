import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Random;

public class _Arrays {
    public static void main(String[] args) {
        // Beispiel for-each Schleife 
        // int arr[] = {1, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        // // i ist nich increment sondern element vom Array
        // for (int i : arr) System.out.println(i);
        
        // Übung 1 - Definieren Sie einen Array von charsin dem „Hello World“ steht.
        char[] charArray = "Hello World".toCharArray(); // Leerzeichen werden berücksichtigt
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
        // System.out.println(Arrays.toString(intArray));
        
        // Füllen Sie in einen int[10] die Zahlen von 1000 bis 1009
        int[] intArray1 = new int[10];
        for (int i = 0; i < intArray1.length; i++) intArray1[i] = 1000 + i;
        // printing
        // System.out.println(Arrays.toString(intArray1));
        
        // ArrayList (dynamic arrays in Java)
        // declaration + initialising
        // ArrayList<Integer> arrayList = 
        //     new ArrayList<>(Arrays.asList(1, 12, 4, 12, 231));
        // declaring and adding elements afterwords
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) arrayList.add(Math.random());
        // System.out.println(arrayList);
        // adding element
        arrayList.add(1d);
        System.out.println(arrayList);
        // getting size/length
        int size = arrayList.size();
        System.out.println(size);
        // accessing element by index
        System.out.println(arrayList.get(size - 1)); // last element    
        // removing element by index
        arrayList.remove(size - 1);
        // sorting, default Comparator is null for natural order
        arrayList.sort(null);
        System.out.println(arrayList);
        
    }   
}
