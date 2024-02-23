package pres;
import ext.DaoImplem2;
import metier.MetierImpl;
public class Presentation {
    public static void main (String[] args){
//        injection des dependances avec instanciation statique => new
        DaoImplem2 dao = new DaoImplem2();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.print("Resultat" + metier.calcul());
    }
}
