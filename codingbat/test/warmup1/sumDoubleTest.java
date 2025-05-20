package warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sumDoubleTest {
    private final sumDouble sum = new sumDouble();
    
    @Test
    void testDifferentNumbers() {
        // Test cases where numbers are different (should return regular sum)
        assertEquals(3, sum.Double(1, 2), "Regular sum when numbers are different (1,2)");
        assertEquals(5, sum.Double(3, 2), "Regular sum when numbers are different (3,2)");
        assertEquals(5, sum.Double(2, 3), "Regular sum when numbers are different (2,3)");
    }

    @Test
    void testSameNumbers() {
        // Test cases where numbers are the same (should return double sum)
        assertEquals(8, sum.Double(2, 2), "Double sum when numbers are same (2,2)");
        assertEquals(12, sum.Double(3, 3), "Double sum when numbers are same (3,3)");
        assertEquals(400, sum.Double(100, 100), "Double sum when numbers are same (100,100)");
    }

    @Test
    void testZeroAndNegative() {
        // Additional edge cases
        assertEquals(0, sum.Double(0, 0), "Testing with zeros");
        assertEquals(0, sum.Double(-1, 1), "Testing with opposite numbers");
        assertEquals(-8, sum.Double(-2, -2), "Testing with negative same numbers");
    }
}