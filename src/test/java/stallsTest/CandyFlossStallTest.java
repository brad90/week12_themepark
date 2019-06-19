package stallsTest;

import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("snowy shop", "bob smith");
    }

    @Test
    public void getName(){
        assertEquals("snowy shop", candyFlossStall.getName());
    }

    @Test
    public void getOwner(){
        assertEquals("bob smith", candyFlossStall.getOwner());
    }
}
