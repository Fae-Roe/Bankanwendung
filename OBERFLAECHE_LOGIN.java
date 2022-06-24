import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Beschreiben Sie hier die Klasse OBERFLAECHE.
 * 
 */
public class OBERFLAECHE_LOGIN implements ActionListener
{
    private JFrame LoginFrame;
    private JPanel LoginPanel;

    private JLabel BenutzerIDLabel;
    private JLabel PINLabel;

    private JButton LoginButton;
    private JButton SchliessenButton;

    private JLabel Bild;

    private JTextField BenutzerIDTextfeld;
    private int BenutzerIDText;
    private JPasswordField PINPasswortfeld;
    private int PINPasswort;

    private JDialog LoginFehlermeldung;
    private JPanel LoginFehlermeldungPanel;
    private JLabel LoginFehlermeldungText;
    private JButton LoginFehlermeldungButton;

    private JDialog Auswahlfenster;
    private JPanel AuswahlfensterPanel;
    private JLabel AuswahlLabel;
    private JRadioButton Auswahl1;
    private JRadioButton Auswahl2;
    private ButtonGroup AuswahlButtonGroup;
    private JButton AuswahlButton;

    private OBERFLAECHE_ANGESTELLTER ansicht1;
    private OBERFLAECHE_KUNDE ansicht2;

    public DATENBANKVERBINDUNG dab;

    public OBERFLAECHE_LOGIN()
    {
        JFrame LoginFrame = new JFrame("Login");
        LoginFrame.setSize(560,420);
        LoginFrame.setResizable(false);
        LoginFrame.setLocationRelativeTo(null);
        //var BankIcon = new ImageIcon("Bilder\\bank.PNG");
        //LoginFrame.setIconImage(BankIcon.getImage());
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginPanel = new JPanel();
        LoginPanel.setLayout(null);
        BenutzerIDLabel = new JLabel("Kundennummer:");
        BenutzerIDLabel.setFont(BenutzerIDLabel.getFont().deriveFont((float) 30));
        BenutzerIDLabel.setBounds(20,180,300,50);
        LoginPanel.add(BenutzerIDLabel);
        BenutzerIDTextfeld = new JTextField(10);
        BenutzerIDTextfeld.setFont(BenutzerIDTextfeld.getFont().deriveFont((float) 30));
        BenutzerIDTextfeld.setBounds(325,180,200,50);
        LoginPanel.add(BenutzerIDTextfeld);
        PINLabel = new JLabel("PIN:");
        PINLabel.setFont(PINLabel.getFont().deriveFont((float) 30));
        PINLabel.setBounds(20,250,200,50);
        LoginPanel.add(PINLabel);
        PINPasswortfeld = new JPasswordField(4);
        PINPasswortfeld.setFont(PINPasswortfeld.getFont().deriveFont((float) 30));
        PINPasswortfeld.setBounds(325,250,200,50);
        LoginPanel.add(PINPasswortfeld);
        LoginButton = new JButton("OK");
        LoginButton.addActionListener(this);
        LoginButton.setBorder(null);
        LoginButton.setBounds(285,320,200,50);
        //LoginButton.setIcon(new ImageIcon("Bilder\\einloggen0.JPG"));
        //LoginButton.setRolloverIcon(new ImageIcon("Bilder\\einloggen1.JPG"));
        LoginPanel.add(LoginButton);
        SchliessenButton = new JButton("Schließen");
        SchliessenButton.addActionListener(this);
        SchliessenButton.setBorder(null);
        SchliessenButton.setBounds(60,320,200,50);
        //SchliessenButton.setIcon(new ImageIcon("Bilder\\schließen0.JPG"));
        //SchliessenButton.setRolloverIcon(new ImageIcon("Bilder\\schließen1.JPG"));
        LoginPanel.add(SchliessenButton);
        Bild = new JLabel();
        Bild.setBounds(60,200,0,0);
        //Bild.setIcon(new ImageIcon("Bilder\\login.JPG"));
        LoginPanel.add(Bild);
        LoginFrame.add(LoginPanel);
        LoginFrame.setVisible(true);

        LoginFehlermeldung = new JDialog();
        LoginFehlermeldung.setLocationRelativeTo(null);
        LoginFehlermeldungPanel = new JPanel();
        LoginFehlermeldungPanel.setLayout(null);
        LoginFehlermeldung.setTitle("Fehler");
        LoginFehlermeldung.setSize(720,200);
        LoginFehlermeldung.setResizable(false);
        LoginFehlermeldung.setModal(true);
        LoginFehlermeldungText = new JLabel("Die eingegebene Kundennummer/PIN ist falsch!");
        LoginFehlermeldungText.setFont(LoginFehlermeldungText.getFont().deriveFont((float) 30));
        LoginFehlermeldungText.setBounds(10,10,720,100);
        LoginFehlermeldungPanel.add(LoginFehlermeldungText);
        LoginFehlermeldungButton = new JButton("OK");
        LoginFehlermeldungButton.setBorder(null);
        LoginFehlermeldungButton.setBounds(310,100,90,50);
        //LoginFehlermeldungButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        //LoginFehlermeldungButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        LoginFehlermeldungButton.addActionListener(this);
        LoginFehlermeldungPanel.add(LoginFehlermeldungButton);
        LoginFehlermeldung.add(LoginFehlermeldungPanel);

        // Auswahlfenster = new JDialog();
        // Auswahlfenster.setLocationRelativeTo(null);
        // AuswahlfensterPanel = new JPanel();
        // AuswahlfensterPanel.setLayout(null);
        // Auswahlfenster.setTitle("Ansicht");
        // Auswahlfenster.setSize(475,320);
        // Auswahlfenster.setResizable(false);
        // Auswahlfenster.setModal(true);
        // AuswahlLabel = new JLabel("Wählen sie bitte ihre Ansicht.");
        // AuswahlLabel.setFont(AuswahlLabel.getFont().deriveFont((float) 30));
        // AuswahlLabel.setBounds(10,10,720,50);
        // AuswahlfensterPanel.add(AuswahlLabel);
        // Auswahl1 = new JRadioButton("Kundenansicht",true);
        // Auswahl1.setFont(Auswahl1.getFont().deriveFont((float) 30));
        // Auswahl1.setBounds(10,80,720,50);
        // AuswahlfensterPanel.add(Auswahl1);
        // Auswahl2 = new JRadioButton("Angestelltenansicht",false);
        // Auswahl2.setFont(Auswahl2.getFont().deriveFont((float) 30));
        // Auswahl2.setBounds(10,150,720,50);
        // AuswahlfensterPanel.add(Auswahl2);
        // AuswahlButtonGroup = new ButtonGroup();
        // AuswahlButtonGroup.add(Auswahl1);
        // AuswahlButtonGroup.add(Auswahl2);
        // AuswahlButton = new JButton();
        // AuswahlButton.setBorder(null);
        // AuswahlButton.setBounds(200,220,90,50);
        // AuswahlButton.setIcon(new ImageIcon("Bilder\\ok0.JPG"));
        // AuswahlButton.setRolloverIcon(new ImageIcon("Bilder\\ok1.JPG"));
        // AuswahlButton.addActionListener(this);
        // AuswahlfensterPanel.add(AuswahlButton);
        // Auswahlfenster.add(AuswahlfensterPanel);

        
    }

    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource() == this.LoginButton)
        {
            try
            {
                PINPasswort = Integer.parseInt(PINPasswortfeld.getText());
                BenutzerIDText = Integer.parseInt(BenutzerIDTextfeld.getText());
                dab = new DATENBANKVERBINDUNG(BenutzerIDText);
                if(dab.LogIn(BenutzerIDText,PINPasswort))
                {

                    int pin = 1;
                    dab.db.conAbfrage("SELECT `pin` FROM `konto` WHERE kontonummer = " + BenutzerIDText);
                    if(dab.db.neuerDatensatz())
                    {
                        pin = dab.db.getInt(1);
                    }
                    if(PINPasswort == pin)
                    {
                        ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,dab);
                        System.out.println("Login Fenster schließen");


                        LoginFrame.setVisible(false);
                    

                    }else

                    {
                        LoginFehlermeldung.setVisible(true);
                    }

                }
                else
                {
                    LoginFehlermeldung.setVisible(true);
                }
            }
            catch(NumberFormatException e)
            {
                LoginFehlermeldung.setVisible(true);
 LoginFrame.setVisible(false);
        
        if(ae.getSource() == this.AuswahlButton)
        {
            if(Auswahl1.isSelected())
            {
                ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,dab);

                LoginFrame.setVisible(false);

                if(ae.getSource() == this.AuswahlButton)
                {
                    if(Auswahl1.isSelected())
                    {
                        ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,dab);
                        LoginFrame.setVisible(false);
                    }
                    else
                    {
                        ansicht1 = new OBERFLAECHE_ANGESTELLTER(BenutzerIDText,dab);
                        LoginFrame.setVisible(false);
                    }
                    Auswahlfenster.setVisible(false);
                    LoginFrame.setVisible(false);
                    LoginPanel.setVisible(false);

                }
            }
            // else if(ae.getSource() == this.AuswahlButton)
            // {
            // if(Auswahl1.isSelected())
            // {
            // ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,db);

            // LoginFrame.setVisible(false);
            // }
            // else
            // {
            // ansicht1 = new OBERFLAECHE_ANGESTELLTER(BenutzerIDText,db);
            // LoginFrame.setVisible(false);
            // }
            // Auswahlfenster.setVisible(false);
            // LoginFrame.setVisible(false);
            // LoginPanel.setVisible(false);


        }

            
    
    // else if(ae.getSource() == this.AuswahlButton)
    // {
    // if(Auswahl1.isSelected())
    // {
    // ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,db);

        // LoginFrame.setVisible(false);
        // }
        // else
        // {
        // ansicht1 = new OBERFLAECHE_ANGESTELLTER(BenutzerIDText,db);
        // LoginFrame.setVisible(false);
        // }
        // Auswahlfenster.setVisible(false);
        // LoginFrame.setVisible(false);
        // LoginPanel.setVisible(false);

        // }
       else if(ae.getSource() == this.SchliessenButton)
        {
            System.exit(0);
        }
        else if(ae.getSource() == this.LoginFehlermeldungButton)
        {
            LoginFehlermeldung.setVisible(false);
        }

    // LoginFrame.setVisible(false);
    // }
    // else
    // {
    // ansicht1 = new OBERFLAECHE_ANGESTELLTER(BenutzerIDText,db);
    // LoginFrame.setVisible(false);
    // }
    // Auswahlfenster.setVisible(false);
    // LoginFrame.setVisible(false);
    // LoginPanel.setVisible(false);
    // }
    if(ae.getSource() == this.SchliessenButton)
    {
   
        // else if(ae.getSource() == this.AuswahlButton)
        // {
        // if(Auswahl1.isSelected())
        // {
        // ansicht2 = new OBERFLAECHE_KUNDE(BenutzerIDText,db);

        // LoginFrame.setVisible(false);
        // }
        // else
        // {
        // ansicht1 = new OBERFLAECHE_ANGESTELLTER(BenutzerIDText,db);
        // LoginFrame.setVisible(false);
        // }
        // Auswahlfenster.setVisible(false);
        // LoginFrame.setVisible(false);
        // LoginPanel.setVisible(false);
        // }
    }
        else if(ae.getSource() == this.SchliessenButton)
        {
            System.exit(0);
        }
        else if(ae.getSource() == this.LoginFehlermeldungButton)
        {
            LoginFehlermeldung.setVisible(false);
        }

    

    else if(ae.getSource() == this.LoginFehlermeldungButton)
    {
        LoginFehlermeldung.setVisible(false);
    }
}
}
}
}
