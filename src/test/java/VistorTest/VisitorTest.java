package VistorTest;

import Visitor.Visitor;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import themePark.ThemePark;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Dodgems dodgems;
    Visitor visitor1;
    ThemePark themePark;


    @Before
    public void before(){
        dodgems = new Dodgems("bump", 10);
        visitor1 = new Visitor(30, 150 , 1000);
        themePark = new ThemePark("Funland");
    }


    @Test
    public void leaveAReview(){
        visitor1.addReview(dodgems, 4, themePark);
        assertEquals(1,visitor1.getReviewedAttractions());
    }

    @Test
    public void leaveASecondReview(){
        visitor1.addReview(dodgems, 4, themePark);
        visitor1.addReview(dodgems, 2, themePark);
        assertEquals(2,visitor1.getReviewedAttractions());
    }
}



