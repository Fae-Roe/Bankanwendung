
/**
 * Beschreiben Sie hier die Klasse ANGESTELLTER.
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public class ANGESTELLTER extends PERSON
{
    private KUNDE aktKunde;
    private BANK bank;
    private KONTO aktKonto;
    public ANGESTELLTER(String name, int pin, BANK bankname)
    {
        bank = bankname;
        
    }

    public int SparkontoEinrichten(double betrag)
    {
        
        return 0;
    }
    
    public int GirokontoEinrichten(double betrag)
    {
        return 0;
    }
    
    public boolean KontoLoeschen()
    {
        aktKonto = null;
        if(aktKonto == null) return true;
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
    
    public String NeuenKundenEinrichten(String newname, int newpin)
    {
        aktKunde.name = newname;
        aktKunde.pin = newpin;
        return name;
    }
    
    public KUNDE AktkundeGeben()
    {
        return aktKunde;
    }
    
    public void KontoSetzen()
    {
        
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
