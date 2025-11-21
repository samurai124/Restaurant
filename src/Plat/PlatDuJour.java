package Plat;

public class PlatDuJour extends Plat {
    private double reduction;

    public PlatDuJour(String nom, double prix, double reduction) {
        super(nom, prix);
        this.reduction = reduction;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public double getPrixFinal() {
        return getPrix() - (getPrix() * reduction);
    }

    @Override
    public void afficherInfo() {
        System.out.printf("Plat du Jour id  : %d , nom  %s , prix : %.2f , réduction : %.0f%% , prix final : %.2f\n",
                getId_plat(),getNom(), getPrix(), reduction * 100, getPrixFinal());
    }
}
