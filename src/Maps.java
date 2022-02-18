import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // "Standard" Deklaration
        HashMap map = new HashMap();
        map.put("key", "value");
        System.out.println(map.toString());

        // Typen sichere Deklaration
        HashMap<String, String> map1 = new HashMap<>();
    }
}
