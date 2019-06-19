package stalls;

import Visitor.Visitor;
import themePark.IReview;
import themePark.ISecurity;

public class CandyFlossStall extends Stall implements ISecurity, IReview {

    public CandyFlossStall(String name, String owner){
        super(name,owner);
    }

    public Boolean isVisitorAllowedToUseService(Visitor visitor){
        return visitor.getAge() > 5;
    }

    public int getRating(){
        return 1;
    }

    public String getName(){
        return super.getName();
    }

}
