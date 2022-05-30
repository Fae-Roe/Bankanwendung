/**
 * Abstrakte Klasse PERSON - beschreiben Sie hier die Klasse
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public abstract class PERSON
{

    protected String name;
    protected int pin;
    DATENBANKVERBINDUNG db;
    public int Kundennummer;
    public PERSON(String n, int p)
    {
        name = n;
        pin = p;
    }
    
    public String NamenGeben()
    {
        return name;
    }
    
    public int PinGeben()
    {
        return pin;
    }
    
}
