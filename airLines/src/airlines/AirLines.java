/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlines;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Click
 */
public class AirLines extends JFrame {
    JButton b1=new JButton("Turkish Air"), 
            b2=new JButton("Qatar Air"),
            b3=new JButton("Iraq Air"), 
            b4=new JButton("Emirates Air"),
            b5=new JButton("Dubai Air");
public AirLines() { setTitle("GridLayout Test"); 
Container pane = getContentPane(); 
pane.setLayout(new GridLayout(2,3)); 
setBounds(0,0,300,100);
pane.add(b1);
pane.add(b2);
pane.add(b3); 
pane.add(b4); 
pane.add(b5); }
 public void actionPerformed(ActionEvent e) {
 } 
    public static void main(String[] args) {
AirLines f = new AirLines(); 
f.setVisible(true);    
    
    
    }
    
}
