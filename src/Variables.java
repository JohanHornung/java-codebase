import java.math.BigInteger;

public class Variables {
    public static void main(String[] args) {
        // double -> float geht weil double > float
        double var = 21.1f * 2.1f;
        // System.out.println(var);
        System.out.println((int) var); // 44
        System.out.println((double) var); // 44.30999755859375

        int max_int = Integer.MAX_VALUE + 1; // -2147483647 (-MIN_VALUE - 1)
        // System.out.println((Integer.MAX_VALUE + 1) == (Integer.MIN_VALUE - 1)); // false
        System.out.println(max_int);
        // System.out.println(Integer.MIN_VALUE);
        
        // implizite Konvertierung
        int my_int = 1;
        float my_float = my_int;
        // explizite Konvertierung
        float my_float1 = (float) my_int;
        System.out.println(my_float);
        System.out.println(my_float1);

        // Enums
        for (Enums val: Enums.values()) {
            System.out.println(val);
            // LOW
            // MEDIUM
            // HIGH
        }
        Enums level = Enums.HIGH;
        switch (level) {
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
            default:
                break;
        }
        // BigInt class for really big ints
        BigInteger bi = new BigInteger("10000000000000000000000");
        System.out.println(bi.add(new BigInteger("45"))); 
    }
}
