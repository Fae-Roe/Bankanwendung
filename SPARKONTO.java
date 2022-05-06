
/**
 * Beschreiben Sie hier die Klasse SPARKONTO.
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public class SPARKONTO extends KONTO
{
    double zinssatz;
    public SPARKONTO(int kontnummer, double kontostand, KUNDE besitzr)
    {
 
        besitzer = besitzr;
        kontnummer = kontonummer;
        kontostand = kontostand;
        
    }
    
    public SPARKONTO(int kontonr, double zinssatz, double kontostN, KUNDE besitzr)
    {
       besitzer = besitzr;

    }

    public void Verzinsen()
    {
        
    }
    
    public double ZinssatzGeben()
    {
        return 0.0;
    
    }
    
    public boolean Abhebeben(double newkontostand)
    {
        return true;
    
    }

}
