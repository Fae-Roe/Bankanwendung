 /**
  * Abstrakte Klasse KONTO - beschreiben Sie hier die Klasse
  * 
  * @author Lena Weeß 
  * @version 20.05.2022
  * 
  * @author Maja Schlecht
  * @version 20.05.2022
  */
public abstract class KONTO
{
    protected double kontostand;
    protected int kontonummer;
    private KUNDE besitzer;
    protected DATENBANKVERBINDUNG dbVerbindung;
    
    public KONTO(int kn, double ks, KUNDE bes, DATENBANKVERBINDUNG db)
    {
      kontonummer = kn;
      kontostand = ks;
      besitzer = bes;
      dbVerbindung = db;
    }
    
    public KONTO(int kn, KUNDE bes, DATENBANKVERBINDUNG db)
    {
        kontonummer = kn;
        besitzer = bes;
        dbVerbindung = db;
    }
    
    public abstract boolean Abheben(double betrag);
    
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
        dbVerbindung.kontostandAendern(kontonummer, kontostand);
    }
    
}
