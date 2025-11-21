import Client.Client;
import Serveur.Serveur;

public class Main {
    public  void main (String[]args){
        Serveur serveur=new Serveur(1,"ser1");
        Client client =new Client();
        client.setVip(false);
        client.PasserCommend();


    }
}