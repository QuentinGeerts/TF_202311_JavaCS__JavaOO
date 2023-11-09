package polymorphisme.models;

public class Cercle {
    public void afficher () {
        System.out.println("Je suis un cercle.");
    }

    public void afficher (int x, int y) {
        System.out.println("Affiche le cercle en position (" + x + ", " + y + ")");
    }
}
