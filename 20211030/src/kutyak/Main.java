
package kutyak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(HarciKutya.getRandomHarciKutya());
        System.out.println(HaziKutya.getRandomHaziKutya());
        List<Kutya> Dogok = new ArrayList();
        
        int n = 0;
        while (n < 50){
            if(Math.random()*100<50){
            Dogok.add(HarciKutya.getRandomHarciKutya());
            n++;
        } else {
            Dogok.add(HaziKutya.getRandomHaziKutya());
          }
        }
        
        System.out.println(Dogok.size());
        for (Kutya kutya : Dogok) {
            System.out.println(kutya);
        }
        
        
        
        int m = 0;
        for (Kutya kutya : Dogok) {
            //if (kutya.getNev() == "Bodri"){
            //if ("Bodri".equals(kutya.getNev())){
            if (Objects.equals("Bodri", kutya.getNev())){
                m++;
            }  
            
        }
        System.out.println("Ennyi Bodrink van: "+m);
        
        int szamlalo = Integer.MIN_VALUE;
        for (Kutya kutya : Dogok) {
            if (kutya instanceof HarciKutya) { // Adott osztályra kasztolható e?
                HarciKutya hk = (HarciKutya) kutya;
                if (hk.getTamadoEro() > szamlalo){
                    szamlalo = hk.getTamadoEro();
                }
            }
        }
        System.out.println("Legnagyobb támadó erő: "+szamlalo);
       
        //System.out.println(HaziKutya.getRUHAK());
        
        int sz = Integer.MIN_VALUE;
        for (Kutya kutya : Dogok) {
                if (kutya.getKor() > sz){
                    sz = kutya.getKor();
                }
        }
        System.out.println("Legidösebb kutya: "+sz);
        
        System.out.println(Dogok);
        
        // növekvőbe rakás getKor alapján
        // Dogok.sort(Comparator.comparing(Kutya::getKor));
        
        // visszafelé listázva getKor alapján
//      Dogok.sort(Comparator.comparing(Kutya::getKor).reversed());
        Collections.sort(Dogok);
        System.out.println(Dogok);
//        Collections.sort(Dogok, new Comparator<Kutya>() {
//            @Override
//            public int compare(Kutya p1, Kutya p2) {
//                return p2.getKor() - p1.getKor();
//            }
//        });
        
//        System.out.println(Dogok);
        String kutyaruha;
        //List<String> kutyaRuhakList = new ArrayList();
        Map<String, Integer> kutyaRuhakMap = new HashMap<>();
        
        //System.out.println(kutyaRuhakMap);
        for (Kutya kutya : Dogok) {
            if (kutya instanceof HaziKutya){
                 HaziKutya hk = (HaziKutya) kutya;
                 kutyaruha = hk.getRuha();
                 if (kutyaRuhakMap.get(kutyaruha) == null){
                     kutyaRuhakMap.put(kutyaruha, 1);
                 } else {
                     int temp;
                     temp = kutyaRuhakMap.get(kutyaruha) +1;
                     kutyaRuhakMap.put(kutyaruha, temp);
                 }      
            }
        }
        System.out.println("");
        System.out.println("Ennyi ruha van: "+kutyaRuhakMap);
        //System.out.println(kutyaRuhakMap.get("Harisnya")); // Map az null add vissza, List az -1 et
        
        
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('C'));
        System.out.println(Character.isDigit('1'));
        System.out.println(!Character.isDigit('a'));
        System.out.println(!Character.isDigit('C'));
        System.out.println(!Character.isDigit('1'));
        
    }
}
