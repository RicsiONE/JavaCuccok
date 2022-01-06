/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajl_kezeles;

import java.io.Serializable;

/**
 *
 * @author ricsi
 */
public class Haromszog implements Serializable{
    private int a, b, c;

    public Haromszog(int a, int b, int c) {
        if ((a+b>c) && (b+c>a) && (a+c>b)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Nem szerkeszthető háromszög!");
        }
        
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Haromszog{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
