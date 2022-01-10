/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame5 extends JFrame implements ActionListener{
    
    private Timer timer = new Timer(200, this);
    private JLabel label = new JLabel("Szeretem a JAVA nyelvet! ");
    
    public Frame5() throws HeadlessException{
        setDefaultCloseOperation(3);
        setSize(900, 240);
        label.setFont(new Font("Monospaced", Font.BOLD, 30));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        timer.start();
        setVisible(true);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(label.getText().substring(1) +label.getText().charAt(0));
        
    }
    
    public static void main(String[] args) {
        new Frame5();
    }
}
