package heritage.models;

public class Oiseau extends Animal {

    private String couleurPlume;

    public Oiseau(String nom, String couleurPlume) {
        super(nom);
        this.couleurPlume = couleurPlume;
    }
}
