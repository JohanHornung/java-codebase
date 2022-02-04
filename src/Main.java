import tiere.Katze;

public class Main {
    public static void main(String[] args) {
        // neue Instanz der Klasse "Katze"
        Katze katze1 = new Katze();
        katze1.alter = 4;
        System.out.println(katze1.alter); // 4
        katze1.schlafen(5);
        System.out.println(katze1.alter); // 9
    }
}
