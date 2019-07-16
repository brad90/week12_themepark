package themePark;

import Visitor.Visitor;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    IReview rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    IceCreamStall iceCreamStall;


    @Before
    public void before(){
        themePark = new ThemePark("funland");
        visitor1 = new Visitor(30 , 200, 1000);
        visitor2 = new Visitor(25, 300, 1000);
        visitor3 = new Visitor(30, 40 ,1000);
        rollerCoaster = new RollerCoaster("yup", 4.0);
        iceCreamStall = new IceCreamStall("ice", "bob");
    }


    @Test
    public void canGetListOfAllRatings(){
        visitor1.addReview(rollerCoaster, 4,themePark );
        visitor2.addReview(rollerCoaster, 3, themePark);
        visitor3.addReview(rollerCoaster, 2, themePark);
        assertEquals(3, themePark.getAllReviews());
    }
}
