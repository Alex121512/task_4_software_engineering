package test;

import main.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testTriangleValid() {
        assertTrue(Triangle.isTriangle(3, 4, 5));  // Valid triangle (3-4-5)
    }

    @Test
    public void testTriangleInvalid() {
        assertFalse(Triangle.isTriangle(1, 1, 10));  // Invalid triangle (1-1-10)
    }
}