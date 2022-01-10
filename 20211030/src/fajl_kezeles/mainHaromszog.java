/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajl_kezeles;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ricsi
 */
public class mainHaromszog {
    public static File f = new File("haromszogek.dat");
    public static  ArrayList<Haromszog> tomblista = new ArrayList<Haromszog>();
    
    public static void main(String[] args) {
        haromszogLetrehozo(100);
        haromszogKiolvas();
        haromszogKiiras();
        
    }

    private static void haromszogLetrehozo(int i) {
        int szamlalo = 0;
        int nemJoszamlalo = 0;
         
            try (FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
                //szamlalo++;
               //System.out.println(szamlalo);
                while (szamlalo < i) {
                    try {
                        Haromszog h = new Haromszog(
                       (int)(Math.random()*4 +1),
                       (int)(Math.random()*4 +1),
                       (int)(Math.random()*4 +1)
                           );
                                
                        oos.writeObject(h);
                        szamlalo++;
                    } catch (IllegalArgumentException e){
                        nemJoszamlalo++;
                        //System.out.println("Nem jött létre");
                    }
                    
                } 
            } catch (FileNotFoundException ex){
                System.out.println("FileNotFound");         
            } catch (IOException ex){
                System.out.println("IOException");
            } 
            System.out.println(szamlalo);
            System.out.println(nemJoszamlalo);
            System.out.println("Létrehozás véget ért");
            
        
    }

    private static void haromszogKiolvas() {
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)){
//            System.out.println(ois.readObject());
//            System.out.println(ois.readObject());
            while (true) { // 
                Object o = ois.readObject();
                tomblista.add((Haromszog) o);
                //System.out.println(o.toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (EOFException ex){
            System.out.println("kiolvasás Vége..");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } 
        
    }

    private static void haromszogKiiras() {
        for (Haromszog haromszog : tomblista) {
            System.out.println(haromszog);
        }
    }
    
}
