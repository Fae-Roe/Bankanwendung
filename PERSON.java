/**
 * Abstrakte Klasse PERSON - beschreiben Sie hier die Klasse
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public abstract class PERSON
{
    public String name;
    public int pin;
    DATENBANKVERBINDUNG db;
    
    public PERSON(String newname, int newpin)
    {
        name = newname;
        pin = newpin;
    }
}
