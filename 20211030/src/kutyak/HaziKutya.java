package kutyak;

import java.util.Objects;

public class HaziKutya extends Kutya{
    private String ruha;
    private static final String [] RUHAK = new String[] {"Cipő", "Sál", "Pulover"};
    
    public HaziKutya(String nev, int kor, String ruha) {
        super(nev, kor);
        this.ruha = ruha;
    }

    public static String[] getRUHAK() {
        return RUHAK;
    }

    public String getRuha() {
        return ruha;
    }

    public void setRuha(String ruha) {
        this.ruha = ruha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.ruha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HaziKutya other = (HaziKutya) obj;
        if (!Objects.equals(this.ruha, other.ruha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +"HaziKutya{" + "ruha=" + ruha + '}';
    }
    
    public static HaziKutya getRandomHaziKutya(){  // létre hoz egy példányt véletlen atributumokal
        String nev = NEVEK[(int)(Math.random()* NEVEK.length)];
        int kor = (int)(Math.random()*30 +1);
        String ruha = RUHAK[(int)(Math.random()* RUHAK.length)];
        return new HaziKutya(nev, kor, ruha);
    }
    
}
