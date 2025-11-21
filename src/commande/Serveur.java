package commande;

public class Serveur {
    private static int nextId = 0;
    private final int id;

    public Serveur(){
        this.id = ++nextId;
    }


    public int getId() {
        return id;
    }

    public boolean serviceVIP(){
        return false;
    }
}
