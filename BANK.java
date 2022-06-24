import java.util.List;
import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse BANK.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 * @author Jasmin Gyer
 * @version 29.05.2022
 */
public class BANK
{
    private DATENBANKVERBINDUNG dbVerbindung;
    private List<KONTO> kontoListe = new ArrayList<KONTO>();
    private List<KUNDE> kundenListe = new ArrayList<KUNDE>();
    private List<ANGESTELLTER> angestelltenListe = new ArrayList<ANGESTELLTER>();
    private int neueKontonummer;

    public BANK(int kNr)
    {
        dbVerbindung = new DATENBANKVERBINDUNG(kNr);
        kontoListe = new ArrayList<KONTO>();
        kundenListe = new ArrayList<KUNDE>();
        angestelltenListe = new ArrayList<ANGESTELLTER>();
        neueKontonummer = 0;
    }

    public int SparkontoEinrichten(double betrag, double zinssatz, KUNDE kunde)
    {
        if(kundenListe.contains(kunde) == true)
        {
            neueKontonummer++;
            KONTO neuesKonto = new SPARKONTO(neueKontonummer, betrag, zinssatz, kunde, dbVerbindung);
            kontoListe.add(neuesKonto);

            return neueKontonummer;
        }

        return -1;
    }

    public int GirokontoEinrichten(double betrag, double ueberziehungsrahmen, KUNDE kunde)
    {
        if(kundenListe.contains(kunde) == true)
        {        
            neueKontonummer++;
            KONTO neuesKonto = new GIROKONTO(neueKontonummer, betrag, ueberziehungsrahmen, kunde, dbVerbindung);
            kontoListe.add(neuesKonto);

            return neueKontonummer;
        }

        return -1;
    }

    public boolean KontoLoeschen(KONTO konto)
    {
        if(kontoListe.contains(konto) == true)
        {
            kontoListe.remove(konto);
            return true;
        }

        return false;
    }

    public boolean AngestelltenLoeschen(ANGESTELLTER angestellter)
    {
        if(angestelltenListe.contains(angestellter) == true)
        {
            angestelltenListe.remove(angestellter);
            return true;
        }

        return false;
    }

    public KUNDE KundeSuchen(String name)
    {
        for (int i = 0; i < kundenListe.size(); i++)
        {
            KUNDE k = kundenListe.get(i);
            if(k.NamenGeben() == name)
            {
                return k;
            }
        }

        return null;
    }

    public int[] KontonummernFuerKundenGeben(KUNDE kunde)
    {
        int anzahl = 0;

        for (int i = 0; i < kontoListe.size(); i++)
        {
            KONTO k = kontoListe.get(i);
            if(k.EigentuemerGeben() == kunde)
            {
                anzahl++;
            }
        }

        if(anzahl > 0)
        {
            int[] kontonummern = new int[anzahl];

            for (int i = 0; i < kontoListe.size(); i++)
            {
                KONTO k = kontoListe.get(i);
                if(k.EigentuemerGeben() == kunde)
                {
                    kontonummern[i] = k.KontonummerGeben();
                }
            }

            return kontonummern;
        }

        return null;
    }

    public ANGESTELLTER AngestelltenSuchen(String name)
    {
        for (int i = 0; i < angestelltenListe.size(); i++)
        {
            ANGESTELLTER a = angestelltenListe.get(i);
            if(a.NamenGeben() == name)
            {
                return a;
            }
        }

        return null;
    }

    public String[] KundennamenGeben()
    {
        int anzahlKunden = kundenListe.size();

        if(anzahlKunden > 0)
        {
            String[] kundennamen = new String[anzahlKunden];

            for (int i = 0; i < anzahlKunden; i++)
            {
                KUNDE k = kundenListe.get(i);
                kundennamen[i] = k.NamenGeben();
            }

            return kundennamen;
        }

        return null;
    }

    public String[] AngestelltennamenGeben()
    {
        int anzahlAngestellte = angestelltenListe.size();

        if(anzahlAngestellte > 0)
        {
            String[] angestelltennamen = new String[anzahlAngestellte];

            for (int i = 0; i < anzahlAngestellte; i++)
            {
                ANGESTELLTER a = angestelltenListe.get(i);
                angestelltennamen[i] = a.NamenGeben();
            }

            return angestelltennamen;
        }

        return null;    
    }

    public KUNDE NeuenKundenEinrichten(String name, int pin)
    {
        if(KundeSuchen(name) == null)
        {
            KUNDE neuerKunde = new KUNDE(name, pin);
            kundenListe.add(neuerKunde);

            return neuerKunde;
        }

        return null;
    }

    public boolean KundenLoeschen(KUNDE kunde)
    {
        if(kundenListe.contains(kunde) == true)
        {
            kundenListe.remove(kunde);
            return true;
        }

        return false;
    }

    public ANGESTELLTER NeuenAngestelltenEinrichten(String name, int pin)
    {
        if(AngestelltenSuchen(name) == null)
        {
            ANGESTELLTER neuerAngestellter = new ANGESTELLTER(name, pin, this);
            angestelltenListe.add(neuerAngestellter);

            return neuerAngestellter;
        }

        return null;
    }

    public BANK BankGeben()
    {
        return this;
    }

    public KONTO KontoSuchen(int kontonummer)
    {
        for (int i = 0; i < kontoListe.size(); i++)
        {
            KONTO k = kontoListe.get(i);
            if(k.KontonummerGeben() == kontonummer)
            {
                return k;
            }
        }

        return null;
    }

    public void Beenden()
    {
        dbVerbindung.VerbindungSchliesen();
    }
}
