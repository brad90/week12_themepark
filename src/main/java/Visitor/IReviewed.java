package Visitor;

import themePark.IReview;
import themePark.ThemePark;

public interface IReviewed {

    public void addReview(IReview attraction, int rating, ThemePark themePark);

}
