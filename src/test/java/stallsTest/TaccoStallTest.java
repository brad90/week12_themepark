package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.TaccoStall;

import static org.junit.Assert.assertEquals;

public class TaccoStallTest {

    TaccoStall taccoStall;

    @Before
    public void before(){
        taccoStall = new TaccoStall("snowy shop", "bob smith");
    }

    @Test
    public void getName(){
        assertEquals("snowy shop", taccoStall.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("bob smith", taccoStall.getOwner());
    }
}
