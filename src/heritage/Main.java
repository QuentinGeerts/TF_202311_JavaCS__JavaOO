package heritage;

import heritage.models.Animal;
import heritage.models.Chat;
import heritage.models.Mammifere;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Toto");
        Mammifere mammifere = new Mammifere("Bernard", 2);
        Chat chat = new Chat("Noirau", 4, false);

        // Tests
        animal.seDeplacer();
        mammifere.seDeplacer();
        chat.seDeplacer();

        // Boxing / unboxing
        Animal animal2 = new Chat("Grosminet", 4, true);
        Chat chat2 = (Chat) animal2;

        ((Chat) animal2).miauler();
        chat2.miauler();

        animal2.seDeplacer();
        chat2.seDeplacer();


    }

}
