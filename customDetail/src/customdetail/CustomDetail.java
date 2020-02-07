/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customdetail;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


/**
 *
 * @author Click
 */
public class CustomDetail extends JFrame{

   
    public static void main(String[] args) {
        
          try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JLabel l;
    JTextField t;
    JButton b;
    JFrame f = new JFrame("Customer Detail ");
    Container cp = f.getContentPane();
    cp.setLayout(new GridBagLayout());
    cp.setBackground(UIManager.getColor("control"));
    GridBagConstraints c = new GridBagConstraints();

    c.gridx = 0;
    c.gridy = GridBagConstraints.RELATIVE;
    c.gridwidth = 1;
    c.gridheight = 1;
    c.insets = new Insets(2, 2, 2, 2);
    c.anchor = GridBagConstraints.EAST;

    cp.add(l = new JLabel("Customer ID:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('n');

    cp.add(l = new JLabel("First Name:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('c');
    cp.add(l = new JLabel("Last Name:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('s');
   
    cp.add(l = new JLabel("Telephone:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('t');
       cp.add(l = new JLabel("Adress:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('t');
   

    c.gridx = 1;
    c.gridy = 0;
    c.weightx = 1.0;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.anchor = GridBagConstraints.CENTER;

    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('n');
    c.gridx = 1;
    c.gridy = GridBagConstraints.RELATIVE;
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('h');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('c');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('s');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('z');
   

    c.weightx = 0.0;
    c.fill = GridBagConstraints.NONE;
    cp.add(b = new JButton("OK"), c);
    b.setMnemonic('o');
      c.fill = GridBagConstraints.NONE;
    cp.add(b = new JButton("cancle"), c);
    b.setMnemonic('o');

    f.pack();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        System.exit(0);
      }
    });
    f.setVisible(true);
    
    
    
       JLabel label = new JLabel("Welcome to Travel Management",JLabel.CENTER);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.getContentPane().add(label); 
        frame.setVisible(true);
        
 
    
        
    }
        
        
        
  }

    
 