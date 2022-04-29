
/**
 * Beschreiben Sie hier die Klasse ANGESTELLTER.
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public class ANGESTELLTER
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
}
