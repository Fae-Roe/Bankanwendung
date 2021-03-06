
/**
 * Die Klasse DATENBANKVERBINDUNG verwaltet eine Datenbankverbindung zu db4free.net.
 * 
 * Die Testdatenbank ist klasse9ab mit der Tabelle MUSIK
 * Das Schema der Tabelle ist MUSIK{Titel:TEXT, Name:TEXT, Alter:ZAHL}
 * 
 * Der Nutzername ist adklass und das Passwort 42test.kl
 * Der Pfad zum Server ist https://www.db4free.net:3306/klasse9ab
 * 
 * @author Oliver Hirsch
 * @version 0.1
 */
public class DATENBANKVERBINDUNG
{
    DB_MySQL db;
    int kNr;
    public DATENBANKVERBINDUNG(int kontNr)
    {
        db = new DB_MySQL();
        kNr = kontNr;
        Verbinden();
    }

    private void Verbinden()
    {
        boolean i;
        i=db.conOeffnen("challenger218.mydhp.de:3306/bank", "root", "kamisama123");
        if(i)
        {
            System.out.println("Verbindung erfolgreich");
        }
        else
        {
            System.out.println("Verbindung fehlgeschlagen");
        }
    }

    public void VerbindungSchliesen()
    {
        boolean i;
        i=db.conClose();
        if(i)
        {
            System.out.println("Verbindung getrennt");
        }
        else
        {
            System.out.println("Verbindung trennen fehlgeschlagen");
        }
    }

    // public int AlterGeben()
    // {
    // int alt = -1;
    // //verwende den Namen test, der ist in der Tabelle hinterlegt
    // db.conAbfrage("SELECT `Alter` FROM `konto` WHERE Name = 'test'");
    // if(db.neuerDatensatz())
    // {
    // alt = db.getInt(1);
    // }
    // return alt;
    // }

    // public void AlterAendern(String benutzername, int aNeu)
    // {
    // db.conExecute("UPDATE konto SET `Alter` = '" + aNeu + "' WHERE Name = '" + benutzername + "'"); 
    // }

    public int pinGeben()
    {
        int pin = 1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `pin` FROM `konto` WHERE kontonummer = " + kNr);
        if(db.neuerDatensatz())
        {

            pin = db.getInt(1);
        }
        return pin;
    }

    public void pinAendern(int pin, int pNeu)
    {
        db.conExecute("UPDATE konto SET `pin` = '" + pNeu + "' WHERE pin = '" + pin + "'"); 
    }

    public double kontostandGeben()
    {
        double kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `kontostand` FROM `konto` WHERE kontonummer = " + kNr);
        if(db.neuerDatensatz())
        {
            kont = db.getDouble(1);
        }
        return kont;
    }

    public void kontostandAendern(double sNeu)
    {
        db.conExecute("UPDATE konto SET `kontostand` = '" + sNeu + "' WHERE kontonummer = '" + kNr + "'"); 
    }

    public int zinssatzGeben()
    {
        int zins = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `zinssatz` FROM `konto` WHERE kontonummer = " + kNr);
        if(db.neuerDatensatz())
        {
            zins = db.getInt(1);
        }
        return zins;
    }

    public void zinssatzAendern(boolean sNeu)
    {
        db.conExecute("UPDATE konto SET `zinssatz` = " + sNeu + "  WHERE kontonummer = " + kNr); 
    }

    public String besitzerGeben()
    {
        String bes = "s";
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `besitzer` FROM `konto` WHERE kontonummer = " + kNr);
        if(db.neuerDatensatz())
        {
            bes = db.getString(1);
        }
        return bes;
    }

    public double ueberziehungsrahmenGeben()
    {
        double ueb = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `ueberziehungsrahmen` FROM `konto` WHERE kontonummer = " + kNr);
        if(db.neuerDatensatz())
        {
            ueb = db.getDouble(1);
        }
        return ueb;
    }

    public void ueberziehungsrahmenAendern(double sNeu)
    {
        db.conExecute("UPDATE konto SET `ueberziehungsrahmen` = '" + sNeu + "' WHERE kontonummer = '" + kNr); 
    }

    public int kontoartGeben()
    {
        int kontart = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `girokonto` FROM `konto` WHERE kontonummer = " + kNr );
        if(db.neuerDatensatz())
        {
            kontart = db.getInt(1);
        }
        return kontart;
    }

    public void kontoartaendern(int kNeu)
    {
        db.conExecute("UPDATE konto SET `girokonto` = " + kNeu + "  WHERE kontonummer = " + kNr); 
    }

    public int kundennummerGeben()
    {
        int kun = -1;

        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `kundennummer` FROM `konto` WHERE kontonummer = " + kNr);

        if(db.neuerDatensatz())
        {
            kun = db.getInt(1);
        }
        return kun;
    }

    public void kundennummerAendern(int sNeu)
    {
        db.conExecute("UPDATE konto SET `kundennummer` = '" + sNeu + "' WHERE kontonummer = '" + kNr + "'"); 
    }

    // nicht fertig
    public boolean LogIn(int BenutzerID,int pin)
    {

        return true;
    }

    public boolean AngestellterOderKunde(int BenutzerID)
    {
        if(BenutzerID == 0) 
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}