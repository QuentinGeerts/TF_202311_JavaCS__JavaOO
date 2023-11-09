package heritage.models;

public class Mammifere extends Animal {

    private int nbPattes;

    public Mammifere (String nom, int nbPattes) {
        // super() → constructeur du parent
        super(nom);
        this.nbPattes = nbPattes;
    }

    // Polymorphisme d'héritage
    @Override
    public void seDeplacer() {
        // super.seDeplacer();
        System.out.println("Le mammifère se déplace sur " + nbPattes + " pattes.");
    }

    @Override
    public String informations() {
        return super.informations() + "\n - Espece : Mammifere\n - Nombre de pattes : " + nbPattes;
    }

    public final void accoucher() {
        System.out.println("L'animal accouche");
    }
}
