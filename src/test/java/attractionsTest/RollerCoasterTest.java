package attractionsTest;

import Visitor.Visitor;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("The screamer", 10);
        visitor1 = new Visitor(30, 150,1000);
        visitor2 = new Visitor(12, 90,10);
    }

    @Test
    public void getName(){
        assertEquals("The screamer", rollerCoaster.getName());
    }

    @Test
    public void isVisitorTallEnoughFalse() {
        assertEquals(false, rollerCoaster.isVisitorAllowedToUseService(visitor2));
    }

    @Test
    public void isVisitorTallEnoughTrue(){
        assertEquals(true, rollerCoaster.isVisitorAllowedToUseService(visitor1));
    }

}
