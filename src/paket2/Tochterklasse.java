package paket2;

import paket1.Mutterklasse;

// Tochter-Klasse aus anderem Paket
public class Tochterklasse extends Mutterklasse {
    public static void main(String[] args) {
        paket2.Tochterklasse mk = new Tochterklasse();
        
        System.out.println(mk.publicInt);
        System.out.println(mk.getPublicNumber());

        System.out.println(mk.protectedInt);
        System.out.println(mk.getProtectedNumber());

    }
    
}
