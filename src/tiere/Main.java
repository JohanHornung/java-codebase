package tiere;


public class Main {
    public static void main(String[] args) {
        // neue Instanz der Klasse "Katze"
        Katze katze1 = new Katze("A", "B", 4);
        // katze1.alter = 4;
//        System.out.println(katze1.alter); // 4
        katze1.schlafen(5);
//        System.out.println(katze1.alter); // 9

        Hund hund = new Hund();
        // Name wird über Setter-Methode gesetzt obwohl Hund.name private ist
        hund.setName("Klaus");
        System.out.println(hund.getName());
    }
}
