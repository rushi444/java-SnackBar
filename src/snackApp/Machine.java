package snackApp;

public class Machine {
    private static int maxID = 0;
    private int id;
    private String name;

    public Machine(int id, String name) {
        maxID++;
        id = maxID;
        this.name = name;
    }

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id; 
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

}