package Visitor;

import themePark.IReview;
import themePark.ThemePark;

import java.util.ArrayList;

public class Visitor implements IReviewed {

    private int age;
    private int height;
    private int money;
    private ArrayList<IReview> attractionReviews;
    private ThemePark themePark;

    public Visitor(int age, int height, int money){
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractionReviews = new ArrayList<IReview>();
    }

    public int getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public int getMoney(){
        return this.money;
    }

    public void addReview(IReview attraction, int rating, ThemePark themePark){
        attraction.setRating(rating);
        themePark.addReviewToAttractionRide(attraction);
        this.attractionReviews.add(attraction);
    }

    public int getReviewedAttractions(){
       return  attractionReviews.size();
    }
}
