import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Beschreiben Sie hier die Klasse OBERFLAECHE_KUNDE.
 * 
 * @author Lena Weeß 
 * @version 20.05.2022
 * 
 * @author Maja Schlecht
 * @version 30.05.2022
 */

public class OBERFLAECHE_KUNDE implements ActionListener
{
    public JFrame KundeFrame;
    public JPanel KundePanel;
    
    public JButton KontostandB;
    public JButton AbhebenB;
    public JButton EinzahlenB;
    public JButton KontoauszugB;
    
    public JDialog KundeKontostand;
    public JPanel KundeKontostandPanel;
    public JLabel KundeKontostandText;
    public JButton KundeKontostandButton;
    
    public JFrame AbhebenFrame;
    public JPanel AbhebenPanel;
    public JButton AbhebenButton;
    public JTextField AbhebenT;
    public double betragAbheben;
    
    public JDialog KundeAbheben;
    public JPanel KundeAbhebenPanel;
    public JLabel KundeAbhebenText;
    public JButton KundeAbhebenButton;
    
    public JDialog EizahlenFrame;
    public JPanel EinzahlenPanel;
    public JButton EinzahlenButton;
    private JTextField EinzahlenT;
    private double betragEinzahlen;
    
    public JDialog KundeEinzahlen;
    public JPanel KundeEinzahlenPanel;
    public JLabel KundeEinzahlenText;
    public JButton KundeEinzahlenButton;
    
    public JDialog KundeKontoauszug;
    public JPanel KundeKontoauszugPanel;
    public JLabel KundeKontoauszugText;
    public JButton KundeKontoauszugButton;
    
    public OBERFLAECHE_KUNDE(int BenutzerID, DATENBANKVERBINDUNG datenbank)
    {
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
        KontostandB.addActionListener(this);
        KundeFrame.add(KontostandB);
        
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
        
        KundeKontostand = new JDialog();
        KundeKontostand.setLocationRelativeTo(null);
        KundeKontostandPanel = new JPanel();
        KundeKontostandPanel.setLayout(null);
        KundeKontostand.setTitle("Kontostand");
        KundeKontostand.setSize(720,200);
        KundeKontostand.setResizable(false);
        KundeKontostand.setModal(true);
<<<<<<< HEAD
        KundeKontostandText = new JLabel("Kontostand: "+ datenbank.kontostandGeben(BenutzerID));
=======
        KundeKontostandText = new JLabel("Kontostand: "+ datenbank.kontostandGeben());
>>>>>>> 11495e400f06405f39bfd950041ebceb6de1adcc
        KundeKontostandText.setFont(KundeKontostandText.getFont().deriveFont((float) 30));
        KundeKontostandText.setBounds(10,10,720,100);
        KundeKontostandPanel.add(KundeKontostandText);
        KundeKontostandButton = new JButton("OK");
        KundeKontostandButton.setBorder(null);
        KundeKontostandButton.setBounds(310,100,90,50);
        KundeKontostandButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        KundeKontostandButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        KundeKontostandButton.addActionListener(this);
        KundeKontostandPanel.add(KundeKontostandButton);
        KundeKontostand.add(KundeKontostandPanel);
        
        AbhebenFrame = new JFrame("Bitte Betrag zum Abheben eingeben");
        AbhebenFrame.setSize(560,420);
        AbhebenFrame.setResizable(false);
        AbhebenFrame.setLocationRelativeTo(null);
        AbhebenFrame.setIconImage(BankIcon.getImage());
        AbhebenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AbhebenPanel = new JPanel();
        AbhebenPanel.setLayout(null);
        AbhebenT = new JTextField(10);
        AbhebenT.setFont(AbhebenT.getFont().deriveFont((float) 30));
        AbhebenT.setBounds(325,180,200,50);
        AbhebenPanel.add(AbhebenT);
        AbhebenButton = new JButton("Fertig");
        AbhebenButton.setBorder(null);
<<<<<<< HEAD

        
        AbhebenButton.setBounds(310,100,90,50);
=======
        AbhebenButton.setBounds(285,320,200,50);
>>>>>>> 11495e400f06405f39bfd950041ebceb6de1adcc
        AbhebenButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        AbhebenButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        AbhebenButton.addActionListener(this);
        AbhebenPanel.add(AbhebenButton);
        AbhebenPanel.add(AbhebenPanel);
        AbhebenFrame.add(AbhebenPanel);
        AbhebenFrame.setVisible(false);
        
        KundeAbheben = new JDialog();
        KundeAbheben.setLocationRelativeTo(null);
        KundeAbhebenPanel = new JPanel();
        KundeAbhebenPanel.setLayout(null);
        KundeAbheben.setTitle("Abheben");
        KundeAbheben.setSize(720,200);
        KundeAbheben.setResizable(false);
        KundeAbheben.setModal(true);
<<<<<<< HEAD
        KundeAbhebenText = new JLabel("abgehobener Betrag: "+ (datenbank.kontostandGeben(BenutzerID) -  0));
=======
        KundeAbhebenText = new JLabel("abgehobener Betrag: "+ (datenbank.kontostandGeben() -  0));
>>>>>>> 11495e400f06405f39bfd950041ebceb6de1adcc
        KundeAbhebenText.setFont(KundeAbhebenText.getFont().deriveFont((float) 30));
        KundeAbhebenText.setBounds(10,10,720,100);
        KundeAbhebenPanel.add(KundeAbhebenText);
        KundeAbhebenButton = new JButton("OK");
        KundeAbhebenButton.setBorder(null);
        KundeAbhebenButton.setBounds(310,100,90,50);
        KundeAbhebenButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        KundeAbhebenButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        KundeAbhebenButton.addActionListener(this);
        KundeAbhebenPanel.add(KundeAbhebenButton);
        KundeAbheben.add(KundeAbhebenPanel);
        
        KundeEinzahlen = new JDialog();
        KundeEinzahlen.setLocationRelativeTo(null);
        KundeEinzahlenPanel = new JPanel();
        KundeEinzahlenPanel.setLayout(null);
        KundeEinzahlen.setTitle("Einzahlen");
        KundeEinzahlen.setSize(720,200);
        KundeEinzahlen.setResizable(false);
        KundeEinzahlen.setModal(true);
        KundeEinzahlenText = new JLabel("eingezahlter Betrag: ");
        KundeEinzahlenText.setFont(KundeEinzahlenText.getFont().deriveFont((float) 30));
        KundeEinzahlenText.setBounds(10,10,720,100);
        KundeEinzahlenPanel.add(KundeEinzahlenText);
        KundeEinzahlenButton = new JButton("OK");
        KundeEinzahlenButton.setBorder(null);
        KundeEinzahlenButton.setBounds(310,100,90,50);
        KundeEinzahlenButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        KundeEinzahlenButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        KundeEinzahlenButton.addActionListener(this);
        KundeEinzahlenPanel.add(KundeEinzahlenButton);
        KundeEinzahlen.add(KundeEinzahlenPanel);
        
        KundeKontoauszug = new JDialog();
        KundeKontoauszug.setLocationRelativeTo(null);
        KundeKontoauszugPanel = new JPanel();
        KundeKontoauszugPanel.setLayout(null);
        KundeKontoauszug.setTitle("Kontoauszug");
        KundeKontoauszug.setSize(720,200);
        KundeKontoauszug.setResizable(false);
        KundeKontoauszug.setModal(true);
        KundeKontoauszugText = new JLabel("Kontoauzug: "+ KUNDE.aktKonto);
        KundeKontoauszugText.setFont(KundeKontoauszugText.getFont().deriveFont((float) 30));
        KundeKontoauszugText.setBounds(10,10,720,100);
        KundeKontoauszugPanel.add(KundeKontoauszugText);
        KundeKontoauszugButton = new JButton("OK");
        KundeKontoauszugButton.setBorder(null);
        KundeKontoauszugButton.setBounds(310,100,90,50);
        KundeKontoauszugButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        KundeKontoauszugButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        KundeKontoauszugButton.addActionListener(this);
        KundeKontoauszugPanel.add(KundeKontoauszugButton);
        KundeKontoauszug.add(KundeKontoauszugPanel);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource() == this.KontostandB)
        {
            KundeKontostand.setVisible(true);
        }
        else if(ae.getSource() == this.AbhebenB)
        {
            AbhebenFrame.setVisible(true);
        }
        else if(ae.getSource() == this.EinzahlenB)
        {
            KundeEinzahlen.setVisible(true);
        }
        else if(ae.getSource() == this.KontoauszugB)
        {
            KundeKontoauszug.setVisible(true);
        }
        else if(ae.getSource() == this.KundeKontostandButton)
        {
            KundeKontostand.setVisible(false);
        }
        else if(ae.getSource() == this.KundeAbhebenButton)
        {
            KundeAbheben.setVisible(false);
        }
        else if(ae.getSource() == this.KundeEinzahlenButton)
        {
            KundeEinzahlen.setVisible(false);
        }
        else if(ae.getSource() == this.KundeKontoauszugButton)
        {
            KundeKontoauszug.setVisible(false);
        }
    }

}
