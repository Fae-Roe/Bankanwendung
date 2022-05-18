
/**
 * Beschreiben Sie hier die Klasse GIROKONTO.
 * 
 * @author Lena Weeß 
 * @version 01.04.2022
 */
public class GIROKONTO extends KONTO
{
    double ueberziehungsrahmen;
    public GIROKONTO(int kontonr, double uzr, KUNDE bes)
    {
        super(kontonr, bes);
        kontonummer = kontonr;
        ueberziehungsrahmen = uzr;
        besitzer = besitzer;
    }
    
    public GIROKONTO(int kontonr, double kstand, double uzr, KUNDE bes)
    {
        super(kontonr, kstand, bes);
        kontonummer = kontonr;
        ueberziehungsrahmen = uzr;
        kontostand = kstand;
        besitzer = bes;
    }
    
    public boolean Abheben(double newkontostand)
    {
        if(newkontostand < kontostand) return true;
        else return false;
    }
    
    public double UeberziehungsrahmenGeben()
    {
        return ueberziehungsrahmen;
    }
}
