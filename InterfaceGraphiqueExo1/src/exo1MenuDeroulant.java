import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class exo1MenuDeroulant implements ActionListener {


public exo1MenuDeroulant(){

    JMenuBar menuBar = new JMenuBar(); // creates the container for all the menu items
    ///////////////////////////////////////////////////////////////////////////////////////////////

    JMenu clientMenu = new JMenu("Clients"); // creates a Clients tab
    clientMenu.setMnemonic(KeyEvent.VK_C);
    menuBar.add(clientMenu); // adds this tab to the container

    JMenu subMenuClients = new JMenu("Client Domestiques"); // the submenu for Clients domestiques

    JMenuItem clientMenuItem = new JMenuItem("Demande d'abonnement/contrat");
    subMenuClients.add(clientMenuItem); // add the menuitem to the submenu within the original menu
    clientMenuItem = new JMenuItem("Modification des infromations clients");
    subMenuClients.add(clientMenuItem);
    clientMenuItem = new JMenuItem("Changement d'adresse");
    subMenuClients.add(clientMenuItem);
    clientMenuItem = new JMenuItem("Changement de tarif");
    subMenuClients.add(clientMenuItem);
    clientMenuItem = new JMenuItem("Resiliation de contrat");
    subMenuClients.add(clientMenuItem);
    clientMenu.add(subMenuClients);

    JMenu subMenuClients2 = new JMenu("Client Non-Domestiques"); // the submenu for Clients NON-- domestiques

    JMenuItem clientMenuItem2 = new JMenuItem("Demande d'abonnement/contrat");
    subMenuClients2.add(clientMenuItem2); // add the menuitem to the submenu within the original menu
    clientMenuItem2 = new JMenuItem("Modification des informations clients");
    subMenuClients2.add(clientMenuItem2);
    clientMenuItem2 = new JMenuItem("Changement d'adresse");
    subMenuClients2.add(clientMenuItem2);
    clientMenuItem2 = new JMenuItem("Changement de puissance");
    subMenuClients2.add(clientMenuItem2);
    clientMenuItem2 = new JMenuItem("Resiliation de contrat");
    subMenuClients2.add(clientMenuItem2);
    clientMenuItem2 = new JMenuItem("Demande de travaux");
    subMenuClients2.add(clientMenuItem2);
    clientMenu.add(subMenuClients2);

    clientMenu.addSeparator();
    JMenuItem clientExit = new JMenuItem("Quitter");
    clientMenu.add(clientExit);

///////////////////////////////////////////////////////////////////////////////////////////////
    JMenu releveMenu = new JMenu("Releve");// creates a releve tab
    releveMenu.setMnemonic(KeyEvent.VK_R);
    menuBar.add(releveMenu);

    JMenuItem releveMenuItem = new JMenuItem("Releve de compteurs");
    releveMenu.add(releveMenuItem);
    releveMenuItem = new JMenuItem("Controle de consommantion");
    releveMenu.add(releveMenuItem);
    releveMenuItem = new JMenuItem("Historique de consommation");
    releveMenu.add(releveMenuItem);


///////////////////////////////////////////////////////////////////////////////////////////////
    JMenu facturationMenu = new JMenu("Facturation");// creates a Facturation tab
    facturationMenu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(facturationMenu);

    JMenuItem facturationMenuItem = new JMenuItem("Facturation (estime,reelle)");
    facturationMenu.add(facturationMenuItem);
    facturationMenuItem = new JMenuItem("Mode de facturation a paiement egaux");
    facturationMenu.add(facturationMenuItem);
    facturationMenuItem = new JMenuItem("Historique de paiement");
    facturationMenu.add(facturationMenuItem);

///////////////////////////////////////////////////////////////////////////////////////////////
    JMenu caisseMenu = new JMenu("Caisse");// creates a Caisse tab
    caisseMenu.setMnemonic(KeyEvent.VK_C);
    menuBar.add(caisseMenu);

    JMenu subMenuCaisse = new JMenu("Encaissement"); // the submenu for Encaissement
    caisseMenu.add(subMenuCaisse);
    JMenu encaissementMenu = new JMenu("Paiement client");
    subMenuCaisse.add(encaissementMenu);
    JMenuItem encaissementMenuItem = new JMenuItem("Paiement Internet");
    encaissementMenu.add(encaissementMenuItem);
    encaissementMenuItem = new JMenuItem("Paiement automatique");
    encaissementMenu.add(encaissementMenuItem);
    encaissementMenuItem = new JMenuItem("Entente de paiement");
    encaissementMenu.add(encaissementMenuItem);
    encaissementMenuItem = new JMenuItem("Confirmer un paiement");
    encaissementMenu.add(encaissementMenuItem);

    JMenuItem subMenuCaisse2 = new JMenuItem("Recouvrement"); // the submenu for Recouvrement
    caisseMenu.add(subMenuCaisse2);


///////////////////////////////////////////////////////////////////////////////////////////////
    JMenu aideMenu = new JMenu("Aide");// creates a Aide tab
    aideMenu.setMnemonic(KeyEvent.VK_A);
    menuBar.add(aideMenu);

    JMenuItem aideMenuItem = new JMenuItem("Aide");
    aideMenu.add(aideMenuItem);
    aideMenuItem = new JMenuItem("Separateur");
    aideMenu.add(aideMenuItem);
    aideMenuItem = new JMenuItem("A propos");
    aideMenu.add(aideMenuItem);

///////////////////////////////////////////////////////////////////////////////////////////////
    JMenu statistiqueMenu = new JMenu("Statistique");// creates a Statistique tab
    statistiqueMenu.setMnemonic(KeyEvent.VK_S);
    menuBar.add(statistiqueMenu);

    JMenuItem statistiqueMenuitem = new JMenuItem("Statistiques des clients");
    statistiqueMenu.add(statistiqueMenuitem);
    statistiqueMenuitem = new JMenuItem("Statistiques des clients");
    statistiqueMenu.add(statistiqueMenuitem);
    statistiqueMenuitem = new JMenuItem("Statistiques des clients");
    statistiqueMenu.add(statistiqueMenuitem);

///////////////////////////////////////////////////////////////////////////////////////////////
    JFrame frame = new JFrame();
    frame.setJMenuBar(menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Homme Machine");
    frame.pack();
    frame.setVisible(true);



}



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
         new exo1MenuDeroulant();
    }
}
