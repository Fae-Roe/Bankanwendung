  /**
  * Abstrakte Klasse KONTO - beschreiben Sie hier die Klasse
  * 
  * @author Lena Weeß 
  * @version 01.04.2022
  */
public abstract class KONTO
   {
    protected double kontostand;
    protected int kontonummer;
    private KUNDE besitzer;
    protected DATENBANKVERBINDUNG verbindung;
    
    public KONTO(int kontonr, double kontostandN, KUNDE besitzerN)
    {
      kontonummer = kontonr;
      kontostand = kontostandN;
      besitzer = besitzerN;
    }
    
    public KONTO(int kontonr, KUNDE besitzerN)
    {
        kontonummer = kontonr;
        besitzer = besitzerN;
    }
    
    public boolean Abheben()
    {
        return false;
    }
    
    public int KontonummerGeben()
    {
        return kontonummer;
    }
    
    public double KontostandGeben()
    {
        return kontostand;
    }
    
    public KUNDE EigentuemerGeben()
    {
        return besitzer;
    }
    
    public void Einzahlen(double betrag)
    {
        kontostand = kontostand + betrag;
    }
    
    }
