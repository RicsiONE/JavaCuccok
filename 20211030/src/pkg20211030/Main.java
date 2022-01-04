
package pkg20211030;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // szököév osztható 4, de nem oszthazó százal vagy 400, viszont ha 100 al osztható nem szököév 
        // 1582 ban vezeték be a szököévet
        /*
        System.out.print("Adj meg egy évet, megmondom hogy szökőév-e: ");
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || year%400 == 0 && year >= 1582) {
            System.out.println("Ez az év szökőév");
        } else {
            System.out.println("Ez nem szökőév");
        }
        */
        
        /*
        Logikai müveletek
        System.out.println("Logikai és műveletek: ");
        System.out.println("");
        
        System.out.println("ÉS müveletek: ");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));
        System.out.println("");
        
        System.out.println("VAGY müveletek: ");
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));
        */
        
        /*
        //Legkisebb szám
        System.out.println("Adj meg egy számot: ");
        int n1 = sc.nextInt();
        
        System.out.println("Adj meg második számot: ");
        int n2 = sc.nextInt();
        
        System.out.println("Adj meg harmadik számot: ");
        int n3 = sc.nextInt();
        
        int kisebb = n1;
        if (n2 < kisebb){
            kisebb = n2;
        }
        if (n3 < kisebb){
            kisebb = n3;
        }
        System.out.println("Ezek a számok közül a legkisseb " + kisebb);
        */
        
        // 3 szám közül melyik a legkissebb If logikai változoval
        /*
        int a = 1, b = 2, c = 3;
        if (a < b) {
            if (a < c) {
                System.out.println("Legkisebb szám: " + a);
            } else { // a >= b, c < b
                System.out.println("Legkisebb szám: " + c);
            }
        } else { //(a >=b)
            if (c < b) {
                System.out.println("Legkisebb szám: " + c);
            } else { // a >=b, c >=b
                System.out.println("Legkisebb szám: " + b);
            }
        }
        */
        
        /*
        //Melyik szám a legkisebb
        System.out.println("Adj meg egy számot: ");
        int n1 = sc.nextInt();
        
        System.out.println("Adj meg második számot: ");
        int n2 = sc.nextInt();
        
        System.out.println("Adj meg harmadik számot: ");
        int n3 = sc.nextInt();
        
        System.out.println("Legkisebb: " + Math.min(n1, Math.min(n2, n3)));
        
        */
    }
    
}
