
package pkg20211030;

public class Teglalap { 
    private int a;
    private int b;
    private int c;

    public Teglalap(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static int kerulet(Teglalap t){  //nem éred el a példány tagokat
        return 2*(t.a+t.b);
    }
    
    public int kerulet(){  // eléred a példánytagokat
        //return 2*(this.a+b);
        return kerulet(this);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        System.out.println("hashkód alapértelmezett" +"\n" + "kerzdő értéke: "+hash);
        hash = 41 * hash + this.a;
        System.out.println("hashkód A oldal: " +hash);
        hash = 41 * hash + this.b;
        System.out.println("hashkód B oldal: " +hash);
        hash = 41 * hash + this.c;
        System.out.println("hashkód C oldal: " +hash);
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
        final Teglalap other = (Teglalap) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        if (this.c != other.c) {
            return false;
        }
        return true;
    }

    
    

    
    
    
    
}
