import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MenuDeroulant implements ActionListener {


    public MenuDeroulant()
    {
        //create the menu bar
        JMenuBar menuBar = new JMenuBar(); // creates the GENERAL CONTAINER FOR THE MENU

        //build the first menu
        JMenu menu = new JMenu("A Menu"); //creates tab A MENU
        menu.setMnemonic(KeyEvent.VK_A); // shortcut of A key to open tab above
        menu.getAccessibleContext().setAccessibleDescription("The only menu n this program that has menu items");
        menuBar.add(menu);

        //a group of JmenuItems
        JMenuItem menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T); // item within A Menu tab
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon",new ImageIcon("images/img.jpg")); // another item within A menu tab
        menuItem.setMnemonic(KeyEvent.VK_B); //short cut set to B key
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);

        // a group of radio buttion menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

//a group of check box menu items
        menu.addSeparator();
        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

//a submenu
        menu.addSeparator();
        JMenu submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

//Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        JFrame frame = new JFrame();
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new MenuDeroulant();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
