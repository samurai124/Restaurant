package Plat;

public class Plat {
    private static int nextId = 1;
    private int id;
    private String nom;
    private double prix;

    public Plat(String nom, double prix) {
        this.id = nextId++;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId_plat() {
        return id;
    }

    public void setId(int id_plat) {
        this.id = id_plat;
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

    public void afficherInfo() {
        System.out.printf("Plat id : %d nom : %s , prix : %.2f\n",id, nom, prix);
    }
}
