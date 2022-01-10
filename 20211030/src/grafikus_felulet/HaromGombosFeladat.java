
package grafikus_felulet;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class HaromGombosFeladat extends JFrame implements ActionListener {
    
    private JButton gomb;
    private JTextArea szoveg = new JTextArea("balbal");
    private JTextField textfield1, textfield2, textfield3;
    private List<Haromszog> kiIras = new ArrayList<>();
    public HaromGombosFeladat()throws HeadlessException{
        
        
        //setLocationRelativeTo(this);
        //JFrame f = new JFrame("Text Field Examples");
        //setLayout(new GridLayout(2, 1));
        //f.getContentPane().setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        setSize(800, 600);
        setDefaultCloseOperation(3);
        setTitle("BH14");
        JPanel felso = new JPanel();
        textfield1 = new JTextField("",10);
        textfield2 = new JTextField("",10);
        textfield3 = new JTextField("",10);
        gomb = new JButton("Gyáá");
        
        add(szoveg);
        felso.add(textfield1);
        felso.add(textfield2);
        felso.add(textfield3);
        felso.add(gomb);
        add(felso, BorderLayout.PAGE_START);

        setVisible(true); 
        gomb.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gomb) {
            Haromszog h;
            try {
                h = new Haromszog(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()), Integer.parseInt(textfield3.getText()));
                kiIras.add(h);
            } catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, "A megadott adatokal a Háromszög nem szerkeszthető!", "Hiba!", JOptionPane.ERROR_MESSAGE);
            }
            
            szoveg.setText(kiIras.toString());
        }
    }
    
    public static void main(String[] args) {
        new HaromGombosFeladat();
    }
}
