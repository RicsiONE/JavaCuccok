package kutyak;

import java.util.logging.Logger;

public class HarciKutya extends Kutya{
    private int tamadoEro;
    
    public HarciKutya(String nev, int kor, int tamadoEro) {
        super(nev, kor);
        this.tamadoEro = tamadoEro;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }

    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.tamadoEro;
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
        final HarciKutya other = (HarciKutya) obj;
        if (this.tamadoEro != other.tamadoEro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +"Harcikutya{" + "tamadoEro=" + tamadoEro + '}';
    }
    
    public static HarciKutya getRandomHarciKutya(){  // létre hoz egy példányt véletlen atributumokal
        String nev = NEVEK[(int)(Math.random()* NEVEK.length)];
        int kor = (int)(Math.random()*30 +1);
        int tamadoero = (int)(Math.random()*100 +1);
        return new HarciKutya(nev, kor, tamadoero);
    }
}
