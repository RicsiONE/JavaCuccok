/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikus_felulet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ricsi
 */
public class Frame3 extends JFrame implements ActionListener{  
    
    private JPanel pn1 = new JPanel();
    private JButton button1 = new JButton("Ok");
    private JButton button2 = new JButton("Mégse");
    private JButton btOpen = new JButton("Open");
    private JTextArea jta = new JTextArea();
    private TextField jtf = new TextField(5);
    
    public Frame3() throws HeadlessException {
        setDefaultCloseOperation(3);
        setTitle("BH14");
        setLocationRelativeTo(this);
        setSize(500, 500);
        pn1.setLayout(new FlowLayout(FlowLayout.RIGHT));  // igazithatjuk valamelyik irányba
        add(pn1);
        pn1.setBackground(new Color(21, 45, 123)); // Color.red
        pn1.add(jtf);
        pn1.add(button1);
        pn1.add(button2);
        add(pn1, BorderLayout.PAGE_END);
        add(new JScrollPane(jta));
        button1.addActionListener(this);  //eseményfigyelő
        button2.addActionListener(this);
        btOpen.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println(jtf.getText());
            try {
                int ev = Integer.parseInt(jtf.getText());
                System.out.println("A beolvasott int: " +ev);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Számot adjál meg!", "Hiba!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == button2) {
            System.exit(0);
        }
        if (e.getSource() == btOpen) {
            open();
        }
    }
    
    public void open() {
        File file = new File(".\\src\\hui\\Frame3.java");
        System.out.println(file.exists());
        try (FileReader fileReader = new FileReader(file)){
            char[] buffer = new char[(int)(file.length())];
            fileReader.read(buffer);
            jta.setText(String.valueOf(buffer));
        } catch (FileNotFoundException ex){
            Logger.getLogger(Frame3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        new Frame3();
    }
        
}
