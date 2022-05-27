/**
 * Abstrakte Klasse PERSON - beschreiben Sie hier die Klasse
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public abstract class PERSON
{
    public String name;
    public int pin;
    DATENBANKVERBINDUNG db;
    public int Kundennummer;
    public PERSON(String newname, int newpin)
    {
        name = newname;
        pin = newpin;
    }
    
}
