
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

    public ANGESTELLTER(String name, int pin, BANK ban)
    {
        super(name,pin);
        bank = ban;
    }

    public int SparkontoEinrichten(double betrag, double zinssatz)
    {
        if(aktKunde != null)
        {
            return bank.SparkontoEinrichten(betrag, zinssatz, aktKunde);
        }

        return -1;
    }

    public int GirokontoEinrichten(double betrag, double ueberziehungsrahmen)
    {
        if(aktKunde != null)
        {
            return bank.GirokontoEinrichten(betrag, ueberziehungsrahmen, aktKunde);
        }

        return -1;
    }

    public boolean KontoLoeschen()
    {
        return bank.KontoLoeschen(aktKonto);
    }

    public boolean AngestelltenLoeschen(String name)
    {
        ANGESTELLTER a = bank.AngestelltenSuchen(name);
        return bank.AngestelltenLoeschen(a);
    }

    public boolean KundeWaehlen(String name)
    {
        KUNDE k = bank.KundeSuchen(name);
        if(k != null)
        {
            aktKunde = k;
            return true;
        }

        return false;
    }

    public KUNDE NeuenKundenEinrichten(String name, int pin)
    {
        return bank.NeuenKundenEinrichten(name, pin);
    }

    public KUNDE AktkundeGeben()
    {
        return aktKunde;
    }

    public boolean KontoSetzen(int kontonummer)
    {
        KONTO k = bank.KontoSuchen(kontonummer);
        if(k != null)
        {
            aktKonto = k;
            return true;
        }

        return false;
    }

    public boolean KundenLoeschen()
    {
        return bank.KundenLoeschen(aktKunde);
    }

    public ANGESTELLTER NeuenAngestelltenEinrichten(String name, int pin)
    {
        return bank.NeuenAngestelltenEinrichten(name, pin);
    }

}
