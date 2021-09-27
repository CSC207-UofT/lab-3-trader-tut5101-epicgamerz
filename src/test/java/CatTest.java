/*
 * This file contains sample JUnit test cases for Cat.java
 */

import org.junit.*;

import static org.junit.Assert.*;

public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat("Black");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Nyaa~", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, c.getPrice());
    }
}