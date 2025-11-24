package Client;

public class Client {
    private static int nextId = 1;
    private int id;
    private String nom;
    private boolean Vip;

    public Client(String nom) {
        this.id = nextId++;
        this.nom = nom;
        this.Vip = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_Client) {
        this.id = id_Client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isVip() {
        return Vip;
    }

    public void setVip(boolean vip) {
        Vip = vip;
    }

    public void PasserCommend() {
        System.out.println("choisir votre type de serveur s'il vous plait : si vous voulez VIP tapez true ");
        if (!Vip) {
            System.out.println("choisir votre plat s'il vous plait");
        } else {
            System.out.println("bienvenus sur notre service vip, veillez choisir votre plat s'il vous plait");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id_Client=" + id +
                ", nom='" + nom + '\'' +
                ", Vip=" + Vip +
                '}';
    }
}
