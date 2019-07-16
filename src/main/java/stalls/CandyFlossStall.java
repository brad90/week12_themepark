package stalls;

import Visitor.Visitor;
import themePark.IReview;
import themePark.ISecurity;

public class CandyFlossStall extends Stall implements ISecurity, IReview {

    private int rating;

    public CandyFlossStall(String name, String owner){
        super(name,owner);
        this.rating = rating;
    }

    public Boolean isVisitorAllowedToUseService(Visitor visitor){
        return visitor.getAge() > 5;
    }

    public int getRating(){
        return this.rating;
    }

    public void setRating(int userRating){
        this.rating = userRating;
    }

    public String getName(){
        return super.getName();
    }

}
