import org.junit.*;

import static org.junit.Assert.*;


public class GamerTest {
    Gamer g;

    @Before
    public void setUp() throws Exception {
        g = new Gamer();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Fortnite!", g.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        g.upgradeSpeed();
        assertEquals(3, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(1, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, g.getPrice());
    }
}