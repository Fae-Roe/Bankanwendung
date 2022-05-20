
/**
 * Beschreiben Sie hier die Klasse ANGESTELLTER.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public class ANGESTELLTER extends PERSON
{
    private KUNDE aktKunde;
    private BANK bank;
    private KONTO aktKonto;
    public ANGESTELLTER(String newname, int newpin)
    {
        super(newname,newpin);
        name = newname;
        pin = newpin;
    }

    public int SparkontoEinrichten(double betrag)
    {
        SPARKONTO spar = new SPARKONTO(aktKonto.kontonummer, betrag, aktKonto.besitzer);
        return aktKonto.kontonummer;
    }
    
    public int GirokontoEinrichten(double betrag)
    {
        GIROKONTO spar = new GIROKONTO(aktKonto.kontonummer, betrag, aktKonto.besitzer);
        return aktKonto.kontonummer;
    }
    
    public boolean KontoLoeschen()
    {
        if(aktKonto != null)
        {
            aktKonto = null;
            return true;
        }
        else return false;
    }
    
    public String AngestellterLoeschen(String name)
    {
        name = null;
        pin = 0;
        return name;
    }
    
    public boolean KundeWaehlen(String name)
    {
        if(aktKunde.name == name) return true;
        else return false;
    }
    
    public String NeuenKundenEinrichten(String name, int pin)
    {
        aktKunde.name = name;
        aktKunde.pin = pin;
        return aktKunde.name;
    }
    
    public KUNDE AktkundeGeben()
    {
        return aktKunde;
    }
    
    public void KontoSetzen()
    {
        double kontostand = aktKonto.kontostand;
        int kontonummer = aktKonto.kontonummer;
        KUNDE besitzer = aktKonto.besitzer;
    }
    
    public String KundenLoeschen()
    {
        aktKunde = null;
        return aktKunde.name;
    }
    
    public String NeuenAngestelltenEinrichten(String newname, int newpin)
    {
        name = newname;
        pin = newpin;
        return name;
    }
    
    }
