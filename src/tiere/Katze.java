package tiere;

public class Katze extends Tier{
    // Eigenschaften/Attribute
    public String name;
    public String fellfarbe;
    public int alter;
    
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
