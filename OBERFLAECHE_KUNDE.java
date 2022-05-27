import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Beschreiben Sie hier die Klasse OBERFLAECHE_KUNDE.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 */

public class OBERFLAECHE_KUNDE extends OBERFLAECHE_LOGIN
{
    private JFrame LoginFrame;
    private JPanel LoginPanel;
    
    public OBERFLAECHE_KUNDE(int BenutzerID, DATENBANKVERBINDUNG datenbank)
    {
        super();
        JFrame LoginFrame = new JFrame("Kunde");
        LoginFrame.setSize(560,420);
        LoginFrame.setResizable(false);
        LoginFrame.setLocationRelativeTo(null);
        var BankIcon = new ImageIcon("Bilder\\bank.PNG");
        LoginFrame.setIconImage(BankIcon.getImage());
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginPanel = new JPanel();
        LoginPanel.setLayout(null);

        LoginFrame.setVisible(true);
    }

}
