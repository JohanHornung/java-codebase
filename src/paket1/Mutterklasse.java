package paket1;

public class Mutterklasse {
    // Klassen Variabeln
    private int privateInt = 4;
    protected int protectedInt = 3;
    int defaultInt = 2;
    public int publicInt = 1;

    // Methoden
    private int getPrivateNumber() {
        return privateInt;
    }
    public int getPublicNumber() {
        return publicInt;
    }
    protected int getProtectedNumber() {
        return protectedInt;
    }
    int getDefaultNumber() {
        return defaultInt;
    }
    
}
