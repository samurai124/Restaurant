package Plat;

public class Plat {
    private int id_plat;
    private String nom;
    private double prix;
    public Plat(int id_plat , String nom , double prix){
        this.id_plat = id_plat;
        this.nom = nom;
        this.prix = prix;
    }
    public int getId_plat() {
        return id_plat;
    }
    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void afficherInfo(){
        System.out.printf("Plat nom : %s , prix : %.2f\n",nom,prix);
    }
}
