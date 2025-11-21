package Restaurant;

import Plat.Plat;
import commande.Commande;
import java.util.*;

public class Restaurant {
    public static Scanner input = new Scanner(System.in);
    private String nom;
    private List<Plat> ListePlat = new ArrayList<>();
    private List<Commande> ListeCommandes = new ArrayList<>();

    public Restaurant(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public List<Plat> getListePlat() {
        return ListePlat;
    }

    public List<Commande> getListeCommandes() {
        return ListeCommandes;
    }

    public void AjouterPlat(){
        System.out.print("Entrez le nom du plat : ");
        String nom = input.nextLine();
        System.out.print("Entrez le prix : ");
        double prix = input.nextDouble();
        input.nextLine();
        Plat p = new Plat(nom,prix);
        ListePlat.add(p);
        System.out.println("Plat a été créé");
    }

    public void SupprimerPlat(){
        System.out.println("Entrez id du plat que vous voulez supprimer :");
        int id = input.nextInt();
        input.nextLine();
        Plat p = recherchePlat(id);
        if (p != null) {
            ListePlat.remove(p);
            System.out.println("Plat supprimé avec succes");
        } else {
            System.out.println("Suppression impossible : plat introuvable !");
        }
    }

    public Plat recherchePlat(int id){
        for(Plat p: ListePlat){
            if(p.getId_plat() == id){
                return p;
            }
        }
        System.out.println("aucun plat trouvé par cette id!!");
        return null;
    }

    public void modifierPlat(){
        System.out.println("Entrez id du plat que vous voulez modifier :");
        int id = input.nextInt();
        input.nextLine();
        Plat p = recherchePlat(id);
        if (p != null) {
            System.out.println("Entrez le nouveau nom :");
            String nom = input.nextLine();
            p.setNom(nom);
            System.out.println("Entrez le nouveau prix :");
            double prix = input.nextDouble();
            input.nextLine();
            p.setPrix(prix);
        }
    }

    public void AjouterCommande(Commande c){
        ListeCommandes.add(c);
    }

    public void AfficherCommandes(){
        System.out.println("=== Historique des commandes ===");
        for(Commande c: ListeCommandes){
            c.afficherDetails();
            System.out.println("--------------------");
        }
    }

    public void AfficherPlat(){
        System.out.println("Entrez id du plat :");
        int id = input.nextInt();
        input.nextLine();
        Plat p = recherchePlat(id);
        if(p != null){
            p.afficherInfo();
        }
    }

    public void afficherMenu(){
        System.out.println("=== Menu des plats ===");
        for(Plat p: ListePlat){
            p.afficherInfo();
        }
    }

    public void MenuAdmin(){
        int choix;
        do{
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Ajouter plat");
            System.out.println("2. Supprimer plat");
            System.out.println("3. Modifier un plat");
            System.out.println("4. Afficher plat");
            System.out.println("5. Afficher menu");
            System.out.println("6. Afficher historique des commandes");
            System.out.println("0. Quitter");
            System.out.printf("\nEntrer votre choix : ");
            choix = input.nextInt();
            input.nextLine();

            switch(choix){
                case 1:
                    AjouterPlat();
                    break;
                case 2:
                    SupprimerPlat();
                    break;
                case 3:
                    modifierPlat();
                    break;
                case 4:
                    AfficherPlat();
                    break;
                case 5:
                    afficherMenu();
                    break;
                case 6:
                    AfficherCommandes();
                    break;
                case 0:
                    break;
                default :
                    System.out.println("Choix invalide ! Veuillez entrer un nombre entre 0 et 6.");
                    break;
            }
        }while(choix != 0);
    }
}
