package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("snowy shop", "bob smith");
    }

    @Test
    public void getName(){
        assertEquals("snowy shop", iceCreamStall.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("bob smith", iceCreamStall.getOwner());
    }
}
