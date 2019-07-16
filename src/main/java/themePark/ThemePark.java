package themePark;

import Visitor.Visitor;
import attractions.Dodgems;
import attractions.RollerCoaster;
import stalls.IceCreamStall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReview> allReviews;
    private RollerCoaster rollerCoaster;
    private Dodgems dodgems;
    private IceCreamStall iceCreamStall;
    private ArrayList<Visitor> allVisitors;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private String themeParkName;


    public ThemePark(String name){
        this.allReviews = new ArrayList<IReview>();
        this.allVisitors = new ArrayList<Visitor>();
        this.themeParkName = name;

    }


    public void addVisitorToPark(Visitor visitor){
        this.allVisitors.add(visitor);
    }

    public int countNumberOfVisitorsInPark(){
        return this.allVisitors.size();
    }

    public void addReviewToAttractionRide(IReview review){
        this.allReviews.add(review);
    }

    public int getAllReviews(){
        return this.allReviews.size();
    }


}
