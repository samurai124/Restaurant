package Client;

public class Client {
    private static int nextId = 0;
    private int id;
    private String nom;
    private boolean Vip;

    public Client(String nom,boolean Vip){
        this.nom = nom;
        this.Vip = Vip;
        this.id = nextId++;
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
        System.out.println("choisir votre type de serveur s'il vous plus : si vous voules VIP apier sur true ");

        if (Vip = false) {
            System.out.println("choisir votre plat s'il vous plait");


        } else {
            System.out.println("bienvenus sur notre service vip  vellez-vous choisir votre plat s'il vous plait ");
        }
    }


    @Override
    public String toString() {
        return "Client.Client{" +
                "id_Client=" + id_Client +
                ", nom='" + nom + '\'' +
                ", historicCommande='" + '\'' +
                ", Vip=" + Vip +
                '}';
    }
}