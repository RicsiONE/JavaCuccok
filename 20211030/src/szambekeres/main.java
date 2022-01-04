/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szambekeres;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ricsi
 */
public class main {
    
    boolean valami; // false default
    public static void main(String[] args) {
        //bekerLekezeltHiba();
        boolean joSzam = false;
        while (joSzam == false){
            try {
                bekerNemLekezeltHiba();
                joSzam = true;
            } catch (InputMismatchException n){
                System.out.println("Hibás szám!");
            }
            
        }
    }
    
    public static void bekerLekezeltHiba() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        try {
            int be = sc.nextInt();
            System.out.println("A bekért szám: " +be);
        } catch (InputMismatchException n){
            System.out.println("Nem számot adtál meg!");
            bekerLekezeltHiba();
        }  
    }
    
    public static void bekerNemLekezeltHiba() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        int be = sc.nextInt();
        System.out.println("A bekért szám: " +be);
        
    }
}
