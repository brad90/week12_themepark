package stalls;

public abstract class Stall {

    private String name;
    private String owner;


    public Stall(String name, String owner){
        this.name = name;
        this.owner = owner;
    }


    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }
}
