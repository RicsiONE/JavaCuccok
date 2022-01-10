/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ricsi
 */
public class Frame2 extends JFrame implements ActionListener{ // Gomb létrehozásához örököltetni kell a JFrame, 
                                                              //ha rámegyünk egy gombra akkor imlamentálni kell a AxtionListenert

    private JButton JButton1 = new JButton("Bt1");  //létrehoztunk 5 nyomogombot
    private JButton JButton2 = new JButton("Bt2");
    private JButton JButton3 = new JButton("Bt3");
    private JButton JButton4 = new JButton("Bt4");
    private JButton JButton5 = new JButton("Bt5");

    public Frame2() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Vagy 3 EXIT_ON_CLOSE helyett
        setSize(800, 700); // Ablak mérete
        setLayout(new BorderLayout()); // ez az alapértelmezet a BorderLayout mikor beállitjuk az ablak méretét
        add(JButton1, BorderLayout.PAGE_START);  // NYomogomb tájolások, itt PAGE_START helyett jó a "First" String is
        add(JButton2, BorderLayout.PAGE_END);
        add(JButton3, BorderLayout.LINE_START);
        add(JButton4, BorderLayout.EAST);
        add(JButton5, BorderLayout.CENTER);
        setVisible(true);  // látható e az ablakunk
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        new Frame2();
    }
}
