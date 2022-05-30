
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
    private KONTO aktKonto;
    
    public KUNDE(String name, int pin)
    {
        super(name,pin);
    }

    public double KontostandGeben()
    {
        if(aktKonto != null)
        {
            return aktKonto.KontostandGeben();
        }
    
        return -1;
    }

    public boolean Abheben(double betrag)
    {
        if(aktKonto != null)
        {
            return aktKonto.Abheben(betrag);
        }
    
        return false;
    }

    public boolean Einzahlen(double betrag)
    {
        if(aktKonto != null)
        {
            aktKonto.Einzahlen(betrag);
        }
    
        return false;
    }

    public boolean AktKontoSetzen(KONTO konto)
    {
        if(konto.EigentuemerGeben().NamenGeben() == name)
        {
            aktKonto = konto;
            return true;
        }

        return false;
    }

    public boolean aktkontoSetzen(int PIN)
    {
         pin = PIN;
        return true;
    }

}
