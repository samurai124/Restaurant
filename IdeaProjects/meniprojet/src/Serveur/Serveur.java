package Serveur;

public class Serveur {
    private int id_serveur;
    private String nom;

    public Serveur(int id_serveur, String nom) {
        this.id_serveur = id_serveur;
        this.nom = nom;
    }

    public int getId_serveur() {
        return id_serveur;
    }

    public void setId_serveur(int id_serveur) {
        this.id_serveur = id_serveur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void service(){
        System.out.println("choisir votre plat ");



    }
    public void serviceVip(){
        System.out.println("bienvenus sur le survice VIP :");


    }

    @Override
    public String toString() {
        return "Serveur.Serveur{" +
                "id_serveur=" + id_serveur +
                ", nom='" + nom + '\'' +
                '}';
    }
}
