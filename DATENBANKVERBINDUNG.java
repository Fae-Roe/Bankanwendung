
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
        db.conAbfrage("SELECT `Alter` FROM `konto` WHERE Name = 'test'");
        if(db.neuerDatensatz())
        {
            alt = db.getInt(1);
        }
        return alt;
    }

    public void AlterAendern(String benutzername, int aNeu)
    {
        db.conExecute("UPDATE konto SET `Alter` = '" + aNeu + "' WHERE Name = '" + benutzername + "'"); 
    }

    public int pinGeben(int pin)
    {
    
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `pin` FROM `konto` WHERE Name = 'Name'");
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

    
    public int kontostandGeben(double kontostand)
    {
        int kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `kontostand` FROM `konto` WHERE kontostand = 'kontostand'");
        if(db.neuerDatensatz())
        {
            kont = db.getInt(1);
        }
        return kont;
    }

    public void kontostandAendern(double kontostand, int sNeu)
    {
        db.conExecute("UPDATE konto SET `kontostand` = '" + sNeu + "' WHERE kontostand = '" + kontostand + "'"); 
    }
    
    public int zinsenGeben(int kontonummer)
    {
        int zins = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Zinsen` FROM `konto` WHERE kontonummer = 'kontonummer'");
        if(db.neuerDatensatz())
        {
            zins = db.getInt(1);
        }
        return zins;
    }

    public void zinsenAendern(int kontonummer, int sNeu)
    {
        db.conExecute("UPDATE konto SET `Zinsen` = '" + sNeu + "' WHERE kontonummer = '" + kontonummer + "'"); 
    }
    
    public int besitzerGeben(int kontonummer)
    {
        int bes = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `besitzer` FROM `konto` WHERE kontonummer = 'kontonummer'");
        if(db.neuerDatensatz())
        {
            bes = db.getInt(1);
        }
        return bes;
    }
    //überziehungsrahmen geben, überziehungsnahmen ändern, giro/sparkonto
     public int ueberziehungsrahmenGeben(int kontonummer)
    {
        int ueb = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `ueberziehungsrahmen` FROM `konto` WHERE kontonummer = 'kontonummer'");
        if(db.neuerDatensatz())
        {
            ueb = db.getInt(1);
        }
        return ueb;
    }
    public void ueberziehungsrahmenAendern(int kontonummer, int sNeu)
    {
        db.conExecute("UPDATE konto SET `ueberziehungsrahmen` = '" + sNeu + "' WHERE kontonummer = '" + kontonummer + "'"); 
    }
    
    public boolean kontoartGeben(int Kontonummer)
    {return false;}
}