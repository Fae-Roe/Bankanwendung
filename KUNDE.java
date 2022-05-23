
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
    int Kundennummer;
    int Kontonummer;
    public KUNDE(String name, int pin)
    {
        super(name,pin);
    }
    
    public double KontostandGeben()
    {
        return db.kontostandGeben(Kontonummer);
    }
    
    public double Abheben(double betrag )
    {
        double b = db.kontostandGeben(Kontonummer) - betrag; 
        db.kontostandAendern(Kontonummer, b);
        return b;
    }
    
    public void Einzahlen(double betrag)
    {
       
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
