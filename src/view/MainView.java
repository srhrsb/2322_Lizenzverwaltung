package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView  extends JFrame {
    private JTextField licenseIdTf, softwareNameTf, licenseUserIdTf,
            userIdTf, userLastNameTf, userFirstNameTf;
    private JButton showLicenseButton, saveLicenseButton, deleteLicenseButton,
           showUserButton, deleteUserButton, saveUserButton;

    private JRadioButton freeRadioButton, proRadioButton, enterpriseRadioButton;

    public MainView(int width, int height) {
        setSize(width, height);
        setTitle("Lizenzverwaltung");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addComponents();
        setVisible(true);
    }

    private void addComponents() {
        setLayout( new BorderLayout() );

        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel radioButtonPanel = new JPanel();

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.WEST);

        //Grid Layout
        centerPanel.setLayout(new GridLayout(8,2) );
        centerPanel.setBorder(new EmptyBorder(5,5,5,5));

        rightPanel.setLayout(new GridLayout(8,1) );
        rightPanel.setBorder(new EmptyBorder(5,5,5,5));

        //buttons License
        showLicenseButton =  new JButton("Lizenz anzeigen");
        saveLicenseButton = new JButton("Lizenz speichern");
        deleteLicenseButton = new JButton("Lizenz löschen");

        //buttons User
        showUserButton =  new JButton("Nutzer anzeigen");
        saveUserButton = new JButton("Nutzer speichern");
        deleteUserButton = new JButton("Nutzer löschen");

        //Textfields License
        licenseIdTf = new JTextField();
        softwareNameTf = new JTextField();
        licenseUserIdTf = new JTextField();

        //Textfields User
        userIdTf = new JTextField();
        userLastNameTf = new JTextField();
        userFirstNameTf = new JTextField();

        //radio button
       freeRadioButton =  new JRadioButton("Free",true);
       proRadioButton = new JRadioButton("Pro");
       enterpriseRadioButton = new JRadioButton("Enterprise");

       ButtonGroup radioButtonGroup = new ButtonGroup();
       radioButtonGroup.add(freeRadioButton);
       radioButtonGroup.add(proRadioButton);
       radioButtonGroup.add(enterpriseRadioButton);

        radioButtonPanel.add(freeRadioButton);
        radioButtonPanel.add(proRadioButton);
        radioButtonPanel.add(enterpriseRadioButton);

        //Panel content license
        centerPanel.add( new JLabel("Lizenz Id:"));
        centerPanel.add( licenseIdTf );
        centerPanel.add( new JLabel("Software:"));
        centerPanel.add( softwareNameTf );
        centerPanel.add( new JLabel("Lizenzinhaber Id:"));
        centerPanel.add( licenseUserIdTf );
        centerPanel.add( new JLabel("Lizenz Typ:"));
        centerPanel.add( radioButtonPanel );

        centerPanel.add( new JLabel() );
        centerPanel.add( new JLabel() );

        //Panel content user
        centerPanel.add( new JLabel("Nutzer Id:"));
        centerPanel.add( userIdTf );
        centerPanel.add( new JLabel("Nachname:"));
        centerPanel.add( userLastNameTf );
        centerPanel.add( new JLabel("Vorname:"));
        centerPanel.add( userFirstNameTf );

        //Buttons
        rightPanel.add( showLicenseButton );
        rightPanel.add( saveLicenseButton );
        rightPanel.add( deleteLicenseButton );
        rightPanel.add( new JLabel() );
        rightPanel.add( new JLabel() );
        rightPanel.add( showUserButton );
        rightPanel.add( saveUserButton );
        rightPanel.add( deleteUserButton );



        topPanel.add(new JLabel("Lizenzen und Nutzer"));

    }

    public void addShowLicenseHandler(ActionListener listener) {

        showLicenseButton.addActionListener((listener));
    }

    public void addSaveLicenseHandler(ActionListener listener) {

        saveLicenseButton.addActionListener((listener));
    }

    public void addDeleteLicenseHandler(ActionListener listener) {

        deleteLicenseButton.addActionListener(listener);
    }

    public void addShowUserHandler(ActionListener listener) {

        showUserButton.addActionListener((listener));
    }

    public void addSaveUserHandler(ActionListener listener){
        saveUserButton.addActionListener((listener));
    }

    public void addDeleteUserHandler(ActionListener listener) {

        deleteUserButton.addActionListener(listener);
    }

    public void showInfoMessage(String message) {
        JOptionPane.showMessageDialog(this, message,
                "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    public boolean confirmDialog(String message) {
        return JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this,
                message, "Frage", JOptionPane.YES_NO_OPTION);
    }


    //Methoden hinzufügen, die die Werte von den Textfeldern holen bzw. setzen
    //Beachten Sie: Datentypen entsprechend behandeln und negative Zahlenwerte behandeln











}
