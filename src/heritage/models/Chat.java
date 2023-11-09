package heritage.models;

public final class Chat extends Mammifere {

    private boolean aimeLait;

    public Chat(String nom, int nbPattes, boolean aimeLait) {
        super(nom, nbPattes);
        this.aimeLait = aimeLait;
    }

    @Override
    public void seDeplacer() {
        super.seDeplacer();
        if (aimeLait) System.out.println("Le chat se déplace vers le bol de lait.");
        else System.out.println("Le chat préfère rester dormir que faire du sport.");
    }

    public void miauler() {
        System.out.println("Miaaouu");
    }

    @Override
    public String informations() {
        return super.informations() + ( aimeLait ? "\n - Aime le lait" : "\n - N'aime pas le lait");
    }
}
