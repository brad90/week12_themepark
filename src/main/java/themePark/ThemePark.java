package themePark;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReview> ratings;

    public ThemePark(){
        this.ratings = new ArrayList<IReview>();
    }

    public void addReview(IReview review){
        this.ratings.add(review);
    }

    public int getAllReviews(){
        return this.ratings.size();
    }
}
