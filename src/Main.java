import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Client.Client;
import Commande.Commande;
import Plat.Plat;
import Serveur.Serveur;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Commande commande = new Commande();

        List<Plat> commandPlats = new ArrayList<>();
        Client client = new Client();
        Serveur serveur = new Serveur();
        boolean service = true;
        int choix;

        do {
            System.out.println("1. pizza prix : 100 DH");
            System.out.println("2. tacos prix 50 DH");
            System.out.println("3. burger prix 80 DH");
            System.out.println("4. drinks prix 20 DH");
            System.out.println("5. salade prix 40 DH");
            System.out.println("6. jus prix 50 DH");
            System.out.println("7. Service VIP prix : 100 DH");
            System.out.println("0. Quitter");
            choix = scanner.nextInt();
            switch (choix){
                case 1:
                    Plat plat1 = new Plat(1,"pizza",100);
                    commandPlats.add(plat1);
                    break;
                case 2:
                    Plat plat2 = new Plat(2,"tacos",50);
                    commandPlats.add(plat2);
                    break;
                case 3:
                    Plat plat3 = new Plat(3,"burger",80);
                    commandPlats.add(plat3);
                    break;
                case 4:
                    Plat plat4 = new Plat(4,"drinks",20);
                    commandPlats.add(plat4);
                    break;
                case 5:
                    Plat plat5 = new Plat(5,"salade",40);
                    commandPlats.add(plat5);
                    break;
                case 6:
                    Plat plat6 = new Plat(6,"jus",50);
                    commandPlats.add(plat6);
                    break;
                case 7:
                    service = serveur.serviceVIP();
                    break;
                case 0:
                    break;
            }
        }while (choix != 0);

        commande.calculeTotalCommande(commandPlats,service);
        commande.afficherDetails(commandPlats,service,client,serveur);
        restaurant.AjouterCommande(commande);


    }
}
