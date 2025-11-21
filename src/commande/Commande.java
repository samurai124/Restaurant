package commande;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private static int nextId = 10;
    private final int id;
    private Serveur serveur;
    private Client client;
    private List<Plat> plats;

    public Commande() {
        this.id = ++nextId;
        this.serveur = serveur;
        this.client = client;
        this.plats = new ArrayList<>();
    }

    public int getId() {
        return id;
    }


    public double calculeTotalCommande(List<Plat> plats,boolean service){

        double total = 0;

        for (Plat p : plats){
            total += p.getPrix();
        }
        if (service == false) {
            total += 100;
        }

        return total;
    }

    void afficherDetails(List<Plat> plats,boolean service,Client client, Serveur serveur){

        System.out.println("numero de client : "+client.getId());
        System.out.println("numero de serveur : "+serveur.getId());
        System.out.println("numero de commande : "+getId());
        System.out.println("les plats : ");
        for (Plat p : plats){
            System.out.println(p.getNom()+", prix : "+p.getPrix());
        }
        if (!service) {
            System.out.println("Service VIP prix : 100 DH");
        }

        System.out.println("Total : "+calculeTotalCommande(plats,service));
    }
}
