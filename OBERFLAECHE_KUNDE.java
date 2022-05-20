
/**
 * Beschreiben Sie hier die Klasse OBERFLAECHE_KUNDE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
<<<<<<< HEAD
public class OBERFLAECHE_KUNDE extends OBERFLAECHE_LOGIN
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse OBERFLAECHE_KUNDE
     */
    public OBERFLAECHE_KUNDE()
    {
        super();
=======
public class OBERFLAECHE_KUNDE
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse OBERFLAECHE_KUNDE
     */
    public OBERFLAECHE_KUNDE(int s, DATENBANKVERBINDUNG e)
    {
        // Instanzvariable initialisieren
        x = 0;
>>>>>>> 95fbf972c23054f752530cf811a0081b4c817943
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
