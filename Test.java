
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 * @author Jasmin Gyer
 * @version 29.05.2022
 */
public class Test
{
    BANK b;

    public Test(int Knr)
    {
        b = new BANK(Knr);
    }

    public void Run()
    {
        //Angestellte
        ANGESTELLTER a1 = b.NeuenAngestelltenEinrichten("A1", 1234);
        if(a1 != null)
        {
            System.out.println("Neuer Angestellter: " + a1.NamenGeben());
        }

        ANGESTELLTER a2 = a1.NeuenAngestelltenEinrichten("A2", 5678);
        if(a2 != null)
        {
            System.out.println("Neuer Angestellter: " + a2.NamenGeben());
        }

        String[] alleAngestellten = b.AngestelltennamenGeben();
        System.out.println("Alle Angestellten:");
        for (int i = 0; i < alleAngestellten.length; i++)
        {
            System.out.println(alleAngestellten[i]);
        }

        //Kunden
        KUNDE k1 = a1.NeuenKundenEinrichten("K1", 4321);
        KUNDE k2 = a2.NeuenKundenEinrichten("K2", 8765);

        String[] alleKunden = b.KundennamenGeben();
        System.out.println("Alle Kunden:");
        for (int i = 0; i < alleKunden.length; i++)
        {
            System.out.println(alleKunden[i]);
        }

        // Konten
        int kontonummer = 0;
        if(a1.KundeWaehlen("K1") == true)
        {
            kontonummer = a1.GirokontoEinrichten(10000, 500);
            System.out.println("Konto mit der Nummer " + kontonummer + "angelegt...");
        }

        KONTO ko = b.KontoSuchen(kontonummer);
        if(ko != null)
        {
            if(k1.AktKontoSetzen(ko) == true)
            {
                System.out.println("... und als aktuelles Konto gesetzt");
            }
        }
        
        double ks = k1.KontostandGeben();
        System.out.println("Kontostand: " + ks);
        
        k1.Einzahlen(1000);
        ks = k1.KontostandGeben();
        System.out.println("Neuer Kontostand: " + ks);
        
        k1.Abheben(2000);
        ks = k1.KontostandGeben();
        System.out.println("Neuer Kontostand: " + ks);
        
        b.Beenden();
    }
}
