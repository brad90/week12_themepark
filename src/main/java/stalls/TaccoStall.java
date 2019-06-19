package stalls;

import Visitor.Visitor;
import themePark.IReview;
import themePark.ISecurity;

public class TaccoStall extends Stall implements ISecurity, IReview {

    public TaccoStall(String name, String owner){
        super(name,owner);
    }

    public Boolean isVisitorAllowedToUseService(Visitor visitor){
        return visitor.getAge() > 18;
    }

    public int getRating(){
        return 1;
    }

    public String getName(){
        return super.getName();
    }
}
