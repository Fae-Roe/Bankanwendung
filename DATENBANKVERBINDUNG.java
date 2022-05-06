
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

    /**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * Konstruktor fuer Objekte der Klasse DATENBANKVERBINDUNG
=======
     * Konstruktor für Objekte der Klasse DATENBANKVERBINDUNG
>>>>>>> f65d928abcb78db34e7358c99d80b55a7b72ea6f
=======
     * Konstruktor für Objekte der Klasse DATENBANKVERBINDUNG
>>>>>>> 07cf5d0f3b425840e2848405b0f3c1b5c9828af0
=======
     * Konstruktor für Objekte der Klasse DATENBANKVERBINDUNG
>>>>>>> 233c5432c077f96abb7a116a11223c554ad867aa
=======
     * Konstruktor für Objekte der Klasse DATENBANKVERBINDUNG
>>>>>>> 233c5432c077f96abb7a116a11223c554ad867aa
=======
     * Konstruktor für Objekte der Klasse DATENBANKVERBINDUNG
>>>>>>> 4122b6a97158fa2ca13eff9ea8d06030726772a3
     */
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

    public int PINGeben()
    {
        int pin = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `PIN` FROM `MUSIK` WHERE Name = 'test'");
        if(db.neuerDatensatz())
        {
            pin = db.getInt(1);
        }
        return pin;
    }

    public void PINaendern(String benutzername, int pNeu)
    {
        db.conExecute("UPDATE MUSIK SET `PIN` = '" + pNeu + "' WHERE Name = '" + benutzername + "'"); 
    }


    public int KontonummerGeben()
    {
        int pin = -1;
        //verwende den Namen test, der ist in der Tabelle hinterlegt
        db.conAbfrage("SELECT `Kontonummer` FROM `MUSIK` WHERE Name = 'test'");
        if(db.neuerDatensatz())
        {
            pin = db.getInt(1);
        }
        return pin;
    }

    public void KontonummerAendern(String benutzername, int kNeu)
    {
        db.conExecute("UPDATE MUSIK SET `Kontonummer` = '" + kNeu + "' WHERE Name = '" + benutzername + "'"); 
    }

}