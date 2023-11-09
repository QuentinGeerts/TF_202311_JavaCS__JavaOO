package heritage;

import heritage.models.*;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Toto");
        Mammifere mammifere = new Mammifere("Bernard", 2);
        Chat chat = new Chat("Noirau", 4, false);
        Canari canari = new Canari("Titi", "Jaune", 1);

        // Tests
        animal.seDeplacer();
        mammifere.seDeplacer();
        chat.seDeplacer();

        // Boxing / unboxing
        Animal animal2 = new Chat("Grosminet", 4, true);
        Chat chat2 = (Chat) animal2;

        // animal2 étant un animal, il n'a accès qu'aux fonctionnalités d'un animal
        // Pour avoir accès aux fonctionnalités d'un chat → convertir en chat
        ((Chat) animal2).miauler();
        chat2.miauler();

        animal2.seDeplacer(); // Attention, seDeplacer du chat car instance du chat dans animal2
        chat2.seDeplacer();

        // Création de l'animalerie
        Animalerie animalerie = new Animalerie();
        animalerie.ajouter(chat);
        animalerie.ajouter(canari);

        // Séjour
        animalerie.sejour();

        // Final
        // Empêche l'héritage si appliqué sur une classe
        // Empêche la redéfinition de la méthode dans une classe enfant si appliqué sur une méthode
        chat.accoucher();
    }

}
