package heritage.models;

public class Animal {

    // Attributs
    private String nom;

    // Constructeur
    public Animal(String nom) {
        this.nom = nom;
    }

    // Getters & Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthodes
    public void seDeplacer () {
        System.out.println("L'animal se déplace");
    }
}
