//package attractionsTest;
//
//import Visitor.Visitor;
//import attractions.Dodgems;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.graalvm.compiler.hotspot.debug.BenchmarkCounters.delta;
//import static org.junit.Assert.assertEquals;
//
//public class DodgemsTest {
//
//    Dodgems dodgems;
//    Visitor visitor1;
//    Visitor visitor2;
//
//    @Before
//    public void before() {
//        dodgems = new Dodgems("The bumps", 10);
//        visitor1 = new Visitor(30, 150, 1000);
//        visitor2 = new Visitor(10, 90, 10);
//
//
//    }
//
//    @Test
//    public void getName() {
//        assertEquals("The bumps", dodgems.getName());
//    }
//
//    @Test
//    public void isVisitorTooOldEnough() {
//        assertEquals(false, dodgems.isVisitorAllowedToUseService(visitor1));
//    }
//
//    @Test
//    public void isVisitorYoungEnough() {
//        assertEquals(true, dodgems.isVisitorAllowedToUseService(visitor2));
//    }
//
//    @Test
//    public void isThereARating() {
//        assertEquals(4, dodgems.getRating());
//    }
//
//    @Test
//    public void isTheVisitorPayingAsAChild() {
//        assertEquals(2.00, dodgems.priceFor(visitor2), delta[00]);
//    }
//    @Test
//    public void isTheVisitorPayingAsAnAdult() {
//        assertEquals(10.00, dodgems.priceFor(visitor1), delta[00]);
//    }
//
//}
