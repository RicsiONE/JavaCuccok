
package pkg20211030;

public class StartMain {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(3, 4, 7);
        Teglalap t2 = new Teglalap(1, 4, 7);
        System.out.println(Teglalap.kerulet(t1));
//        int hash = 3;
//        hash = 41 * hash + 3;
//        System.out.println("hashkód A oldal: " +hash);
//        hash = 41 * hash + 4;
//        System.out.println("hashkód B oldal: " +hash);
//        hash = 41 * hash + 7;
//        System.out.println("hashkód C oldal: " +hash);
        System.out.println("t1 téglalap osztály hash: " +t1.hashCode());
        System.out.println("t2 téglalap osztály hash: " +t2.hashCode());
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(Integer.toHexString(26));
    }
}
