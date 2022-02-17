package tiere;

public class Katze extends Tier{
    // Eigenschaften/Attribute
    public String name;
    public String fellfarbe;
    public int alter;
    
    // Konstruktor
    public Katze(String name, String fellfarbe, int alter) {
        this.name = name;
        this.fellfarbe = fellfarbe;
        this.alter = alter;
    }
    // Verhalten/Methoden    

    // wenn schlafen() aufgerufen wird, wird das alter um zeit erhöht
    public void schlafen(int zeit) {
        alter += zeit;
    };
    public void fressen() {
        // ...
    };
    public void spielen() {
        // ...
    };



}
