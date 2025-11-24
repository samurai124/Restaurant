package commande;

import Client.Client;
import Plat.Plat;
import Serveur.Serveur;
import java.util.*;

public class Commande {
    private static int nextId = 1;
    private final int id;
    private Serveur serveur;
    private Client client;
    private List<Plat> plats = new ArrayList<>();

    public Commande(Serveur serveur, Client client, ArrayList<Plat> plats) {
        this.id = ++nextId;
        this.serveur = serveur;
        this.client = client;
        this.plats = plats;
    }

    public int getId() {
        return id;
    }

    public double calculeTotalCommande(List<Plat> plats, boolean service) {
        double total = 0;
        for (Plat p : plats) {
            total += p.getPrix();
        }
        if (service) {
            total += 100;
        }
        return total;
    }

    public void afficherDetails() {
        System.out.println("numero de client : " + client.getId());
        System.out.println("numero de serveur : " + serveur.getId());
        System.out.println("numero de commande : " + getId());
        System.out.println("les plats : ");
        for (Plat p : plats) {
            System.out.println(p.getNom() + ", prix : " + p.getPrix());
        }
        if (client.isVip()) {
            System.out.println("Service VIP prix : 100 DH");
        }
        System.out.println("Total : " + calculeTotalCommande(plats, client.isVip()));
    }
}
