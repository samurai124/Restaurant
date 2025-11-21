import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private String nom;
    private List<Plat>ListePlat = new ArrayList<>();
    private List<Commande>ListeCommandes = new ArrayList<>();

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
        System.out.print("Entrez le nom du plat :");
        String nom = input.nextLine();
        System.out.print("Entrez le prix :");
        double prix = input.nextDouble();
        System.out.println("Plat a été créé");
        Plat p = new Plat(nom,prix);
        ListePlat.add(p);
    }

    public void SupprimerPlat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez id du plat que vous pouvez supprimer :");
        int id = input.nextInt();
        recherchePlat(id);
        if (recherchePlat(id) != null) {
            ListePlat.remove(recherchePlat(id));
            System.out.println("Plat supprimer avec succes");
        } else {
            System.out.println("Suppression impossible : plat introuvable !");
        }
    }

    public Plat recherchePlat(int id){
        Plat plattrouve = null;
        for(Plat p: ListePlat){
            if(p.getId_plat() == id){
                plattrouve = p;
            }
        }if(plattrouve == null){
            System.out.println("aucune plate trouvé par cette id!!");
        }
        return plattrouve;
    }

    public void modifierPlat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez id du plat que vous pouvez modifier :");
        int id = input.nextInt();
        for(Plat p: ListePlat){
            if(p.getId_plat() == id){
                System.out.println("Entrez le nouveau nom :");
                String nom = input.nextLine();
                p.setNom(nom);
                System.out.println("Entrez le nouveau prix :");
                double prix = input.nextDouble();
                p.setPrix(prix);
            }else{
                System.out.println("aucune plate trouvé par cette id!!");
            }
        }
    }

    public void AjouterCommande(Commande c){
        ListeCommandes.add(c);
    }

    public void AfficherCommandes(){
        System.out.println("=== Historique des commandes ===");
        for(Commande c: Listecommandes){
            c.afficherDetails();
        }
    }

    public void AfficherPlat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez id du plat");
        int id = input.nextInt();
        recherchePlat(id).afficherInfo();
    }

    public void afficherMenu(){
        System.out.println("=== Menu du plates ===");
        for(Plat p: ListePlat){
            p.afficherInfo();
        }
    }
    public void MenuAdmin(){
        int choix;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Ajouter plat");
            System.out.println("2. Supprimer plat");
            System.out.println("3. Modifier un plat");
            System.out.println("4. Afficher plat");
            System.out.println("5. Afficher menu");
            System.out.println("6. Afficher historique du commandes");
            System.out.println("0. Quitter");
            choix = input.nextInt();

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
                default :
                    System.out.println("Choix invalide ! Veuillez entrer un nombre entre 0 et 6.");
                    break;
            }

        }while(choix != 0);

    }
}
