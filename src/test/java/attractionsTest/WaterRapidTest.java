package attractionsTest;

import attractions.WaterRapids;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterRapidTest {

    WaterRapids waterRapids;

    @Before
    public void before(){
        waterRapids = new WaterRapids("The wet one", 10);
    }

    @Test
    public void getName(){
        assertEquals("The wet one", waterRapids.getName());
    }

}
