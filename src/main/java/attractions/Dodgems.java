package attractions;

import Visitor.Visitor;
import themePark.IReview;
import themePark.ISecurity;
import themePark.ITicketed;

public class Dodgems extends Attraction implements ISecurity, IReview, ITicketed {

    private double price;

    public Dodgems(String type, int price){
        super(type);
        this.price = price;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    public Boolean isVisitorAllowedToUseService(Visitor visitor) {
        return visitor.getAge() < 16 || visitor.getHeight() > 120;
    }

    public int getRating(){
        return 4;
    }

   public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){

        double childPrice  = 2.00;

        if(visitor.getAge() < 10 ){
            return childPrice;
        }
        return this.defaultPrice();
    }
}
