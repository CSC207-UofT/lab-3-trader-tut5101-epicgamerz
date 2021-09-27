import org.junit.*;

import static org.junit.Assert.*;

public class BasketballTest {
    Basketball b;

    @Before
    public void setUp() throws Exception {
        b = new Basketball();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bounce Bounce", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, b.getPrice());
    }
}
