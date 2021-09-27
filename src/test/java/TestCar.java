import org.junit.*;
import static org.junit.Assert.*;


public class TestCar {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car(50000, 160);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50000, c.getPrice());
    }
}
