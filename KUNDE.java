
/**
 * Beschreiben Sie hier die Klasse KUNDE.
 * 

 * @author Lena Weeß 
 * @version 20.05.2022

 * @author Jasmin Geyer 
 * @version 20.05.2022

 */
public class KUNDE extends PERSON
{
    KUNDE aktKonto;
    DATENBANKVERBINDUNG db;
    int Kundennumemr;
    public KUNDE(String name, int pin)
    {
        super(name,pin);
    }
    
    public double KontostandGeben(int KNr)
    {
        return db.kontostandGeben(KNr);
    }
    
    public double Abheben(double betrag)
    {
        return 0;
    }
    
    public void Einzahlen(double betrag)
    {
       
    }
    
    public double KontostandErfragen()
    {
        
        return 0;
    }
    
    public void KontoauszugErstellen()
    {
        
    }
    
    public boolean aktkontoSetzen(int PIN)
    {
       aktKonto.pin = PIN;
       return true;
    
    }
    
}
