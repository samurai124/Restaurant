import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private String nom;
    private List<Plat>ListePlat = new ArrayList<>();
    private List<Commande>ListeCommandes = new ArrayList<>();

    public Restaurant(String nom){
        this.nom = nom;
    }

    public void AjouterPlat(String nom, double prix){
        Plat p = new Plat();
        ListePlat.add(p);
    }

    public void SupprimerPlat(Plat p){
        ListePlat.remove(p);
    }

    public void AjouterCommande(Commande c){
        ListeCommandes.add(c);
    }

    public void AfficherCommandes(){
        System.out.println("=== Historique des commandes ===");
        for(Commande p: Listecommandes){
            System.out.println("Commande "+p.getNom()+", du client "
                    +p.getClientid()+", servie par serveur "+p.getServeurid());
        }
    }

    public void AfficherPlat(Plat p){
        p.afficherDetails();
    }

    public void afficherMenu(){
        System.out.println("=== Menu du plates ===");
        for(Plat p: ListePlat){
            p.afficherDetails();
        }
    }
    public void MenuAdmin(){
        int choix;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Ajouter plat");
            System.out.println("2. Supprimer plat");
            System.out.println("3. Afficher plat");
            System.out.println("4. Afficher menu");
            System.out.println("5. Afficher commande");
            System.out.println("0. Quitter");
            choix = input.nextInt();

            switch(choix){
                case 1:
                    System.out.print("Entrez le nom du plat :");
                    String nom = input.nextLine();
                    System.out.print("Entrez le prix :");
                    double prix = input.nextDouble();
                    AjouterPlat(nom,prix);
                    System.out.println("Plat a été créé");
                    break;
                case 2:
                    System.out.println("Entrez id du plat que vous pouvez supprimer");
                    int id = input.nextInt();
                    for(Plat p: ListePlat){
                        if(p.getId() == id){
                           SupprimerPlat(e);
                        }else{
                            System.out.println("aucune plate trouvé par cette id!!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Entrez id du plat");
                    id = input.nextInt();
                    for(Plat p: ListePlat){
                        if(id == p.getId()){
                            AfficherPlat(p);
                        }System.out.println("aucune plate trouvé par cette id!!");
                    }
                    break;
                case 4:
                    afficherMenu();
                    break;
                case 5:
                    System.out.println("Entrez l'id du commande");
                    id = input.nextInt();
                    for(Commande c: ListeCommandes){
                        if(id == c.getId()){
                            c.afficherDetails();
                        }
                    }
                    break;
            }

        }while(choix != 0);

    }


}
