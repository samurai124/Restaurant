import Client.Client;
import Plat.Plat;
import Plat.PlatSpecial;
import Plat.PlatDuJour;
import Restaurant.Restaurant;
import Serveur.Serveur;
import commande.Commande;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Restaurant.Restaurant
        Restaurant restaurant = new Restaurant("MonRestaurant");

        // Add some servers
        List<Serveur> serveurs = new ArrayList<>();
        serveurs.add(new Serveur("Ahmed"));
        serveurs.add(new Serveur("Sara"));
        serveurs.add(new Serveur("Rachid"));

        // Add some plats
        restaurant.getListePlat().add(new Plat("Salade", 30));
        restaurant.getListePlat().add(new PlatSpecial("Pizza", 50, 10));
        restaurant.getListePlat().add(new PlatDuJour("Steak", 100, 0.2));

        int choix;
        do {
            System.out.println("\n=== Bienvenue au Restaurant.Restaurant ===");
            System.out.println("1. Menu Admin");
            System.out.println("2. Passer une commande (Client)");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = input.nextInt();
            input.nextLine();

            switch (choix) {
                case 1:
                    restaurant.MenuAdmin();
                    break;
                case 2:
                    // Client info
                    System.out.print("Entrez votre nom : ");
                    String nomClient = input.nextLine();
                    Client client = new Client(nomClient);
                    boolean vip;
                    System.out.print("Voulez-vous VIP ? (oui/non) : ");
                    String choix_vip = input.nextLine();
                    if (choix_vip.equalsIgnoreCase("oui")) {
                        vip = true;
                    } else {
                        vip = false;
                    }
                    client.setVip(vip);


                    // Show menu
                    restaurant.afficherMenu();

                    // Client selects plats
                    ArrayList<Plat> commandePlats = new ArrayList<>();
                    String continuer;
                    do {
                        System.out.print("Entrez l'ID du plat à ajouter : ");
                        int idPlat = input.nextInt();
                        input.nextLine();
                        Plat p = restaurant.recherchePlat(idPlat);
                        if (p != null) {
                            commandePlats.add(p);
                        }
                        System.out.print("Ajouter un autre plat ? (oui/non) : ");
                        continuer = input.nextLine();
                    } while (continuer.equalsIgnoreCase("oui"));

                    // Assign random server
                    Random r = new Random();
                    Serveur serveur = serveurs.get(r.nextInt(serveurs.size()));

                    // Create command
                    Commande commande = new Commande(serveur, client, commandePlats);
                    restaurant.AjouterCommande(commande);

                    System.out.println("\n=== Détails de votre commande ===");
                    commande.afficherDetails();
                    break;

                case 0:
                    System.out.println("Merci d'avoir utilisé notre application !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);
    }
}
