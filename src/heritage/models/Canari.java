package heritage.models;

public final class Canari extends Oiseau {

    private int largeurBec;

    public Canari(String nom, String couleurPlume, int largeurBec) {
        super(nom, couleurPlume);
        this.largeurBec = largeurBec;
    }

    public void piailler () {
        System.out.println("Le canari piaille.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le canari fait le tour de sa cage.");
    }

    @Override
    public String informations() {
        return super.informations() + "\n - Largeur du bec : " + largeurBec + " cm";
    }

}
