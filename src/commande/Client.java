package commande;

public class Client {
    private static int nextId = 23;
    private final int id;

    public Client(){
        this.id = ++nextId;
    }


    public int getId() {
        return id;
    }

}

