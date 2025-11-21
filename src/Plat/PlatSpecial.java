package Plat;

public class PlatSpecial extends Plat {
    private double supplement;

    public PlatSpecial(int id_plat, String nom, double prix, double supplement) {
        super(id_plat, nom, prix);
        this.supplement = supplement;
    }

    public double getSupplement() {
        return supplement;
    }

    public void setSupplement(double supplement) {
        this.supplement = supplement;
    }

    public double getPrixFinal() {
        return getPrix() + supplement;
    }

    @Override
    public void afficherInfo() {
        System.out.printf("Plat Special : %s , prix de base : %.2f , supplément : %.2f , prix final : %.2f\n",
                getNom(), getPrix(), supplement, getPrixFinal());
    }
}
