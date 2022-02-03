package mypackage;
import mypackage.Personne;
import mypackage.Montre;


public class Mymain {

    public  static void main(String[] arg){
        Montre Rolex = new Montre(23,58);
        Montre FakeRolex = new Montre(Rolex);
        Personne moi = new Personne("Nkoum");
        Personne toi = new Personne("Lionel");
        toi.porteMontre(FakeRolex);
        moi.porteMontre(Rolex);
        moi.demanderHeure(toi);
        moi.Pmontre.avance();
        toi.demanderHeure(moi);

    }
}
