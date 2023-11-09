package heritage.models;

import java.util.ArrayList;

public class Animalerie {

    private ArrayList<Animal> listeAnimaux;

    public Animalerie() {
        listeAnimaux = new ArrayList();
    }

    public void ajouter (Animal animal) {
        listeAnimaux.add(animal);
    }

    public void sejour () {

        System.out.println("Séjour des animaux : " + listeAnimaux.size());

        for (Animal a : listeAnimaux) {

            System.out.println(a.informations());
            a.seDeplacer();

            if (a instanceof Chat) {
                ((Chat) a).miauler();
            }

            else if (a instanceof Canari) {
                ((Canari) a).piailler();
            }
        }

        System.out.println();

    }

}
