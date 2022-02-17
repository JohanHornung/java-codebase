package paket2;

import paket1.Mutterklasse;

// Unbeteiligte Klasse aus anderem Paket
public class Main {
    public static void main(String[] args) {
        Mutterklasse mk = new Mutterklasse();
        
        System.out.println(mk.publicInt); 
        System.out.println(mk.getPublicNumber()); 
    }
}
