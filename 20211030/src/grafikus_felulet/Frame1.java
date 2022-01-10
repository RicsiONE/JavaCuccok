/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ricsi
 */

public class Frame1 extends JFrame implements ActionListener{

    private JButton bt1 = new JButton("Teszt");
    public Frame1(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new FlowLayout());
        add(bt1);
        bt1.addActionListener(this);
        //bt1.
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hahó");
    }
    
    public static void main(String[] args) {
        new Frame1();
    }
}
