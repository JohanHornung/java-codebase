package paket1;
// Unbeteiligte Klasse aus gleichem Paket
public class Main {
    public static void main(String[] args) {
        Mutterklasse mk = new Mutterklasse();
        
        System.out.println(mk.defaultInt); 
        System.out.println(mk.getDefaultNumber()); 
        
        System.out.println(mk.publicInt);
        System.out.println(mk.getPublicNumber());

        System.out.println(mk.protectedInt);
        System.out.println(mk.getProtectedNumber());

    }

}
