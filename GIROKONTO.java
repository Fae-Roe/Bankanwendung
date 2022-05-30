
/**
 * Beschreiben Sie hier die Klasse GIROKONTO.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public class GIROKONTO extends KONTO
{
    private double ueberziehungsrahmen;
    
    public GIROKONTO(int kn, double uzr, KUNDE bes, DATENBANKVERBINDUNG db)
    {
        super(kn, bes, db);
        ueberziehungsrahmen = uzr;
    }
    
    public GIROKONTO(int kn, double ks, double uzr, KUNDE bes, DATENBANKVERBINDUNG db)
    {
        super(kn, ks, bes, db);
        ueberziehungsrahmen = uzr;
    }
    
    public boolean Abheben(double betrag)
    {
        double neuerKontostand = kontostand - betrag;
        
        if(neuerKontostand >= -ueberziehungsrahmen)
        {
            kontostand = neuerKontostand;
            dbVerbindung.kontostandAendern(kontonummer, kontostand);
            return true;
        }
        
        return false;
    }
    
    public double UeberziehungsrahmenGeben()
    {
        return ueberziehungsrahmen;
    }
}
