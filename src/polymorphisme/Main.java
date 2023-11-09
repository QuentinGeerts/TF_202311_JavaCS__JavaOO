package polymorphisme;

import polymorphisme.models.Cercle;
import polymorphisme.models.Point;

public class Main {

    public static void main(String[] args) {

        // Polymorphisme d'ad hoc
        Point point = new Point();
        Cercle cercle = new Cercle();

        point.afficher();
        cercle.afficher();

        // Polymorphisme paramétrique
        cercle.afficher();
        cercle.afficher(1, 2);

        // Polymorphisme d'héritage
        // Lié à l'héritage : Surcharge d'un méthode (@Override)
        // Vu dans le prochain chapître
    }

}
