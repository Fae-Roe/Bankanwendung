
/**
 * Beschreiben Sie hier die Klasse SPARKONTO.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public class SPARKONTO extends KONTO
{
    private double zinssatz;
    
    public SPARKONTO(int kn, double ks, KUNDE bes, DATENBANKVERBINDUNG db)
    {
        super(kn, ks, bes, db);
        zinssatz =  1.0;
    }
    
    public SPARKONTO(int kn, double ks, double zs, KUNDE bes, DATENBANKVERBINDUNG db)
    {
       super(kn, ks, bes, db);
       zinssatz =  zs;
    }

    public void Verzinsen()
    {
        kontostand = kontostand + kontostand * zinssatz;
    }
    
    public double ZinssatzGeben()
    {
        return zinssatz;
    }
    
    public boolean Abheben(double betrag)
    {
        double neuerKontostand = kontostand - betrag;
        
        if(neuerKontostand >= 0)
        {
            kontostand = neuerKontostand;
            dbVerbindung.kontostandAendern(kontonummer, kontostand);
            return true;
        }
        
        return false;
    }

}
