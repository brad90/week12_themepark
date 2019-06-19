package attractions;

public abstract class Attraction {

    private String type;

    public Attraction(String type){
        this.type = type;
    }


    public String getName(){
        return this.type;
    }

}
