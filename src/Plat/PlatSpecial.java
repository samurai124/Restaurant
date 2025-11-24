package Plat;

public class PlatSpecial extends Plat {
    private double supplement;

    public PlatSpecial(String nom, double prix, double supplement) {
        super(nom, prix);
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
        System.out.printf("Plat Special id %d , nom : %s , prix de base : %.2f , supplément : %.2f , prix final : %.2f\n",
                getId_plat(),getNom(), getPrix(), supplement, getPrixFinal());
    }
}
