import org.junit.*;

import static org.junit.Assert.*;

public class PokemonTest {
    Pokemon p;

    @Before
    public void setUp() throws Exception {
        p = new Pokemon("Bulbasaur");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bulbasaur!", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p.upgradeSpeed();
        assertEquals(7, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p.downgradeSpeed();
        assertEquals(2, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(45, p.getPrice());
    }
}
