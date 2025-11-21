package Plat;

public class PlatDuJour extends Plat {
    private double reduction;

    public PlatDuJour(int id_plat, String nom, double prix, double reduction) {
        super(id_plat, nom, prix);
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
        System.out.printf("Plat du Jour : %s , prix : %.2f , réduction : %.0f%% , prix final : %.2f\n",
                getNom(), getPrix(), reduction * 100, getPrixFinal());
    }

}
