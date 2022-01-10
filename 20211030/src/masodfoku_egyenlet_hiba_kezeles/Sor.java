/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodfoku_egyenlet_hiba_kezeles;

/**
 *
 * @author ricsi
 */
public class Sor {
    /** a három együttható és a diszkrimináns*/
    private double a, b, c, diszkr;
    /** az egyenlet gyökei numerikusan*/
    private double x[];
    /* az egyenlet gyökei szövegesen*/
    String eredmeny;

    /** konstruktor*/
    public Sor (double a_, double b_, double c_) {
        b = b_;
        a = a_;
        if (a_ == 0) {
            throw new MasodfokuHibaKezeles("nem másodfokú egyenlet");
        }
        c = c_;
        x = new double[2];  //megoldások helye
        megoldokeplet();    //szamitas
    }

    /** A másodfokú egyenlet gyökei*/
    private void megoldokeplet() {
        //diszkrimináns
        diszkr = b * b - 4 * a * c;
        // megoldások száma mennyi?
        if (diszkr > 0) {
            x[0] = (-b + Math.sqrt(diszkr)) / (2.0 * a);
            x[1] = (-b - Math.sqrt(diszkr)) / (2.0 * a);
            eredmeny = "x1 = " + x[0] + " ; x2 = " + x[1];
            System.out.println(eredmeny);
        } else if (diszkr == 0) {
            x[0] = (-b / 2 * a);
            eredmeny = "x = " + x[0];
            System.out.println(eredmeny);
        } else {
            throw new MasodfokuHibaKezeles("Nincs valós megoldás!");
            //eredmeny = "Nincs valós megoldás!";
        }

    }

    /** Az eredmény szövegesen*/
    public String getZerushely() {
        return "Az " + a + "*x^2+" + b + "*x+" + c + "=0 egyenlet \n\tgyökei: " + eredmeny;
    }
}
