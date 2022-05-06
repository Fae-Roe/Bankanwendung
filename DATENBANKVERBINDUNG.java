
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
<<<<<<< HEAD
=======

>>>>>>> a7e2c5651c86be71add6a93f1677d30442ba689c
    public DATENBANKVERBINDUNG()
    {
        db = new DB_MySQL();
        Verbinden();
    }

    private void Verbinden()
    {
        boolean i;
        i=db.conOeffnen("db4free.net:3306/klasse9ab", "adklass", "42test.kl");
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

    public int PINGeben(String Name)
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

    public void PINaendern(String Name, int pNeu)
    {
        db.conExecute("UPDATE MUSIK SET `PIN` = '" + pNeu + "' WHERE Name = '" + Name + "'"); 
    }


    public int KontonummerGeben(String Name)
    {
        int konn = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Kontonummer` FROM `MUSIK` WHERE Name = 'Name'");
        if(db.neuerDatensatz())
        {
            konn = db.getInt(1);
        }
        return konn;
    }

    public void KontonummerAendern(String Name, int kNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Kontonummer` = '" + kNeu + "' WHERE Name = '" + Name + "'"); 
    }
    
    public int KontostandGeben(String Name)
    {
        int kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Kontonummer` FROM `MUSIK` WHERE Name = 'Name'");
        if(db.neuerDatensatz())
        {
            kont = db.getInt(1);
        }
        return kont;
    }

    public void KontostandAendern(String Name, int sNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Kontonummer` = '" + sNeu + "' WHERE Name = '" + Name + "'"); 
    }
    
    public int ZinsenGeben(String Name)
    {
        int kont = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Zinsen` FROM `MUSIK` WHERE Name = 'Name'");
        if(db.neuerDatensatz())
        {
            kont = db.getInt(1);
        }
        return kont;
    }

    public void ZinsenAendern(String Name, int sNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Zinsen` = '" + sNeu + "' WHERE Name = '" + Name + "'"); 
    }
    
    public int BesitzerGeben(String Name)
    {
        int bes = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Besitzer` FROM `MUSIK` WHERE Name = 'Name'");
        if(db.neuerDatensatz())
        {
            bes = db.getInt(1);
        }
        return bes;
    }

    public void BesitzerAendern(String Name, int bNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Besitzer` = '" + bNeu + "' WHERE Name = '" + Name + "'"); 
    }
}