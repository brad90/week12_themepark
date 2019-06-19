package themePark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void getReviewsNumber(){
        themePark.addReview(visitor.addReview());
        assertEquals(3, themePark.getAllReviews());
    }
}
