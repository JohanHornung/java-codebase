package tiere;

public class Hund extends Tier {
    private String name;

    // getter-Methode --> "read-only attribut"
    public String getName() {
        return this.name;
    }
    // setter-Methode --> "write-only" attribut
    public void setName(String name) {
        this.name = name;
    }
}
