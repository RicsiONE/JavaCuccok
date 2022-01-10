/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ricsi
 */
public class FrameMagyarZaszlo extends JFrame implements ActionListener{
    private JPanel pn1 = new JPanel();
    private JPanel pn2 = new JPanel();
    private JPanel pn3 = new JPanel();
    public FrameMagyarZaszlo() throws HeadlessException{
        setDefaultCloseOperation(3);
        setTitle("BH14");
        setLocationRelativeTo(this);
        setSize(500, 500);
        setLayout(new GridLayout(3, 1));
        pn1.setBackground(Color.red);
        pn2.setBackground(Color.white);
        pn3.setBackground(Color.GREEN);
        add(pn1);
        add(pn2);
        add(pn3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        new FrameMagyarZaszlo();
    }

}
