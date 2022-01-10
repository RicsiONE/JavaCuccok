
package kozos_tanulas;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Adjon meg egy szöveget: ");
        System.out.println("Duble");
        double  dub = s1.nextDouble();
        System.out.println("Int");
        int num1 = s1.nextInt();
        System.out.println("Int2");
        int num2 = s1.nextInt();
        String csak = s1.nextLine();
        System.out.println("String 1");
        String str1 = s1.nextLine();
        System.out.println("String 2");
        String str2 = s1.nextLine();
        
        
        System.out.println("duble: "+dub);
        System.out.println("int: "+num1);
        System.out.println("int2: "+num1);
        System.out.println("String1: "+str1);
        System.out.println("String2: "+str2);
        
    }
}
