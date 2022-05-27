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
    private JFrame KundeFrame;
    private JPanel KundePanel;
    
    private JButton KontostandB;
    private JButton AbhebenB;
    private JButton EinzahlenB;
    private JButton KontoauszugB;
    
    public OBERFLAECHE_KUNDE(int BenutzerID, DATENBANKVERBINDUNG datenbank)
    {
        super();
        KundeFrame = new JFrame("Kunde");
        KundeFrame.setSize(560,420);
        KundeFrame.setResizable(false);
        KundeFrame.setLocationRelativeTo(null);
        var BankIcon = new ImageIcon("Bilder\\bank.PNG");
        KundeFrame.setIconImage(BankIcon.getImage());
        KundeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        KundePanel = new JPanel();
        KundePanel.setLayout(null);
        
        KontostandB = new JButton("Kontostand");
        KontostandB.addActionListener(this);
        KontostandB.setBorder(null);
        KontostandB.setBounds(120,180,100,50);
        KontostandB.setIcon(new ImageIcon("Bilder\\kontostand0.JPG"));
        KontostandB.setRolloverIcon(new ImageIcon("Bilder\\kontostand1.JPG"));
        KundePanel.add(KontostandB);
        
        KontoauszugB = new JButton("Kontoauszug");
        KontoauszugB.addActionListener(this);
        KontoauszugB.setBorder(null);
        KontoauszugB.setBounds(300,180,100,50);
        KontoauszugB.setIcon(new ImageIcon("Bilder\\kontoauszug0.JPG"));
        KontoauszugB.setRolloverIcon(new ImageIcon("Bilder\\kontoauszug1.JPG"));
        KundePanel.add(KontoauszugB);
        
        AbhebenB = new JButton("Abheben");
        AbhebenB.addActionListener(this);
        AbhebenB.setBorder(null);
        AbhebenB.setBounds(120,260,100,50);
        AbhebenB.setIcon(new ImageIcon("Bilder\\abheben0.JPG"));
        AbhebenB.setRolloverIcon(new ImageIcon("Bilder\\abheben1.JPG"));
        KundePanel.add(AbhebenB);
        
        EinzahlenB = new JButton("Einzahlen");
        EinzahlenB.addActionListener(this);
        EinzahlenB.setBorder(null);
        EinzahlenB.setBounds(300,260,100,50);
        EinzahlenB.setIcon(new ImageIcon("Bilder\\einzahlen0.JPG"));
        EinzahlenB.setRolloverIcon(new ImageIcon("Bilder\\einzahlen1.JPG"));
        KundePanel.add(EinzahlenB);
        
        KundeFrame.add(KundePanel);
        
        KundeFrame.setVisible(true);
    }

}
