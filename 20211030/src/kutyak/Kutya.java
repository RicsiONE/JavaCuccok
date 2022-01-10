
package kutyak;

import java.util.Comparator;
import java.util.Objects;

public class Kutya implements Comparable<Kutya> {
    private String nev;
    private int kor;
    protected static final String [] NEVEK = new String[] {"Bodri", "Buksi", "Cézár"};

    
    public Kutya(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nev);
        hash = 59 * hash + this.kor;
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
        final Kutya other = (Kutya) obj;
        if (this.kor != other.kor) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kutya{" + "nev=" + nev + ", kor=" + kor + "}" ;
    }

//    @Override
//    public int compare(Object obj1, Object obj2) {
//       Integer p1 = ((Kutya) obj1).getKor();
//       Integer p2 = ((Kutya) obj2).getKor();
//
//       if (p1 > p2) {
//           return 1;
//       } else if (p1 < p2){
//           return -1;
//       } else {
//           return 0;
//       }
//    }

    @Override
    public int compareTo(Kutya o) {
        return  o.getKor() - this.getKor();
    }
    
	
}
