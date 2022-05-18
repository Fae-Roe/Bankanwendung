
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
    public DATENBANKVERBINDUNG()
    {
        db = new DB_MySQL();
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

    public int AlterGeben()
    {
        int alt = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Alter` FROM `MUSIK` WHERE Name = 'test'");
        if(db.neuerDatensatz())
        {
            alt = db.getInt(1);
        }
        return alt;
    }

    public void AlterAendern(String benutzername, int aNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Alter` = '" + aNeu + "' WHERE Name = '" + benutzername + "'"); 
    }

    public int PINGeben(int Kontonummer)
    {
        int pin = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `PIN` FROM `MUSIK` WHERE Name = 'Name'");
        if(db.neuerDatensatz())
        {
            pin = db.getInt(1);
        }
        return pin;
    }

    public void PINaendern(int Kontonummer, int pNeu)
    {
        db.conExecute("UPDATE MUSIK SET `PIN` = '" + pNeu + "' WHERE Kontonummer = '" + Kontonummer + "'"); 
    }

    
    public int KontostandGeben(int Kontonummer)
    {
        int kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `kontostand` FROM `konto` WHERE kontonummer = 'kontonummer'");
        if(db.neuerDatensatz())
        {
            kont = db.getInt(1);
        }
        return kont;
    }

    public void KontostandAendern(int Kontonummer, int sNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Kontonummer` = '" + sNeu + "' WHERE Kontonummer = '" + Kontonummer + "'"); 
    }
    
    public int ZinsenGeben(int Kontonummer)
    {
        int kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Zinsen` FROM `MUSIK` WHERE Kontonummer = 'Kontonummer'");
        if(db.neuerDatensatz())
        {
            kont = db.getInt(1);
        }
        return kont;
    }

    public void ZinsenAendern(int Kontonummer, int sNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Zinsen` = '" + sNeu + "' WHERE Kontonummer = '" + Kontonummer + "'"); 
    }
    
    public int BesitzerGeben(int Kontonummer)
    {
        int bes = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Besitzer` FROM `MUSIK` WHERE Kontonummer = 'Kontonummer'");
        if(db.neuerDatensatz())
        {
            bes = db.getInt(1);
        }
        return bes;
    }
    //überziehungsrahmen geben, überziehungsnahmen ändern, giro/sparkonto
     public int UeberziehungsrahmenGeben(int Kontonummer)
    {
        int ueb = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Ueberziehungsrahmen` FROM `MUSIK` WHERE Kontonummer = 'Kontonummer'");
        if(db.neuerDatensatz())
        {
            ueb = db.getInt(1);
        }
        return ueb;
    }
    public void UeberziehungsrahmenAendern(int Kontonummer, int sNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Ueberziehungsrahmen` = '" + sNeu + "' WHERE Kontonummer = '" + Kontonummer + "'"); 
    }
    
    public boolean KontoartGeben(int Kontonummer)
    {return false;}
}