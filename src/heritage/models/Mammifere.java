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

}
