  /**
  * Abstrakte Klasse KONTO - beschreiben Sie hier die Klasse
  * 
  * @author Lena Weeß 
  * @version 01.04.2022
  */
public abstract class KONTO
   {
    protected double kontostand;
    public int kontonummer;
    public KUNDE besitzer;
    public DATENBANKVERBINDUNG verbindung;
    
    public KONTO(int kontonr, double kstand, KUNDE bes)
    {
      kontonummer = kontonr;
      kontostand = kstand;
      besitzer = bes;
    }
    
    public KONTO(int kontonr, KUNDE besitzerN)
    {
        kontonummer = kontonr;
        besitzer = besitzerN;
    }
    
    public boolean Abheben()
    {
        return Abheben();
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
