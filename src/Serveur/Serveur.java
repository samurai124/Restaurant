package Serveur;

public class Serveur {
    private static int nextId = 1;
    private int id;
    private String nom;

    public Serveur(String nom) {
        this.id = nextId++;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_serveur) {
        this.id = id_serveur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void service() {
        System.out.println("choisir votre plat ");
    }

    public void serviceVip() {
        System.out.println("bienvenus sur le service VIP :");
    }

    @Override
    public String toString() {
        return "Serveur{" +
                "id_serveur=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
