
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

    public int SparkonotoEinrichten(double betrag)
    {
        
        return 0;
    }
    
    public int GirokontoEinrichten(double betrag)
    {
        
        return 0;
    }
    
    public boolean KontoLoeschen()
    {
        
        return true;
    }
    
    public String AngestellterLoeschen(String name)
    {
        
        return null;
    }
    
    public boolean KundeWaehlen(String name)
    {
        
        return true;
    }
    
    public String NeuenKundenEinrichten(String name, int pin)
    {
        
        return null;
    }
    
    public KUNDE AktkundeGeben()
    {
     
        return null;
    }
    
    public void KontoSetzen()
    {
        
    }
    
    public String KundenLoeschen()
    {
        
        return null;
    }
    
    public String NeuenAngestelltenEinrichten(String name, int pin)
    {
        
        return null;
    }
    
    }
