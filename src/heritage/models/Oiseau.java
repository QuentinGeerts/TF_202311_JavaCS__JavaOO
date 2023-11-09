package heritage.models;

public class Oiseau extends Animal {

    private String couleurPlume;

    public Oiseau(String nom, String couleurPlume) {
        super(nom);
        this.couleurPlume = couleurPlume;
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau se déplace en volant.");
    }

    @Override
    public String informations() {
        return super.informations() + "\n - Espece : Oiseau\n - Couleur des plumes : " + couleurPlume;
    }
}
