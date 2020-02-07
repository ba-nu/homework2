
package flight;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Flight {

   
    public static void main(String[] args) {
 JFrame frame = new JFrame("flight details ");

        JPanel entreePanel = new JPanel();
        final ButtonGroup entreeGroup = new ButtonGroup();
        JRadioButton radioButton;
        entreePanel.add(radioButton = new JRadioButton(" Standard"));
        radioButton.setActionCommand(" Standard");
        entreeGroup.add(radioButton);
        entreePanel.add(radioButton = new JRadioButton(" Economy"));
        radioButton.setActionCommand(" Economy");
        entreeGroup.add(radioButton);
        entreePanel.add(radioButton = new JRadioButton(" First Class", true));
        radioButton.setActionCommand(" First Class");
        entreeGroup.add(radioButton);

      
        final JPanel condimentsPanel = new JPanel();
        condimentsPanel.add(new JCheckBox(" Single"));
        condimentsPanel.add(new JCheckBox(" Return"));

         final JPanel Panel = new JPanel();
         Panel.add(new JCheckBox(" Adult"));
         Panel.add(new JCheckBox(" Child"));


        JPanel sub = new JPanel();
        JButton orderButton = new JButton(" Submit");
        sub.add(orderButton);

         JPanel exit = new JPanel();
        JButton Button = new JButton(" Exit");
        exit.add(Button);
        
        Container content = frame.getContentPane(); 
        content.setLayout(new GridLayout(5, 1));
        content.add(entreePanel);
        content.add(condimentsPanel);
        content.add(Panel);

        content.add(sub);
                content.add(exit);


        orderButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
            String entree =
              entreeGroup.getSelection().getActionCommand();
            System.out.println(entree + " Flight");
            Component[] components = condimentsPanel.getComponents();
            for ( Component c : components ) {
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected())
                System.out.println("With " + cb.getText());
            }
          }
        });

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(300, 150);
        frame.setVisible(true);
    }    }
    

