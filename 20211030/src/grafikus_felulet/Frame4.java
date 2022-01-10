/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ricsi
 */

public class Frame4 extends JFrame{
    
    public Frame4() throws HeadlessException{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 1));
        JPanel pnF = new JPanel();
        pnF.setLayout(new GridLayout(3 ,3));
        for (int i = 0; i < 9; i++) {
            JButton bt = new JButton("XXX" +i);
            pnF.add(bt);
        }
        add(pnF);
        JLabel lb = new JLabel("BH14");
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setFont(new Font("Monospaced", Font.BOLD, 30));
        lb.setForeground(Color.BLUE);
        add(lb);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Frame4();
    }
}
