package stalls;

import Visitor.Visitor;
import themePark.IReview;
import themePark.ISecurity;

public class IceCreamStall extends Stall implements ISecurity, IReview {

    private int rating;

    public IceCreamStall(String name, String owner){
        super(name,owner);
        this.rating = rating;
    }

    public Boolean isVisitorAllowedToUseService(Visitor visitor){
        return visitor.getAge() > 5;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int userRating){
        this.rating = userRating;
    }

    public String getName(){
        return super.getName();
    }
}
