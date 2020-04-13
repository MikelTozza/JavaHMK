import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;


    public GUI(){
        frame = new JFrame(); // created it in the larger scope

        button = new JButton("Click me"); // created it in the larger scope
        button.addActionListener(this);


        label = new JLabel("Number of Clicks: ");


        panel = new JPanel(); // created it in the larger scope
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our First GUI");
        frame.pack();
        frame.setVisible(true);


    }


    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of Clicks: "+ count);
    }
}
