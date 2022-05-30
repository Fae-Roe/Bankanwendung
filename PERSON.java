/**
 * Abstrakte Klasse PERSON - beschreiben Sie hier die Klasse
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */
public abstract class PERSON
{
<<<<<<< HEAD
    protected String name;
    protected int pin;

    public PERSON(String n, int p)
=======
    public String name;
    public int pin;
    DATENBANKVERBINDUNG db;
    public int Kundennummer;
    public PERSON(String newname, int newpin)
>>>>>>> ec1a3d062e2f28af9b449b21e464d98dddb6b0f7
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
