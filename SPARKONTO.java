
/**
 * Beschreiben Sie hier die Klasse SPARKONTO.
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public class SPARKONTO extends KONTO
{
    double zinssatz;
    public SPARKONTO(int kontonummer, double kontostand, KUNDE besitzer)
    {
        super(kontonummer, kontostand, besitzer);
    }
    
    public SPARKONTO(int kontonummer, double zinssatz, double kontostand, KUNDE besitzer)
    {
       super(kontonummer, kontostand, besitzer);
       this.zinssatz =  zinssatz;
    }

    public void Verzinsen()
    {
        kontostand = kontostand + kontostand * zinssatz;
    }
    
    public double ZinssatzGeben()
    {
        return zinssatz;
    }
    
    public boolean Abheben(double newkontostand)
    {
        if(newkontostand < kontostand) return true;
        else return false;
    }

}
