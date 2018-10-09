package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private String title;
    private int id;

    private Product productUnderTest;

    @Before
    public void setUp() {
        title = "title";
        id = 0;
        productUnderTest = new Product(title, id) {
            @Override
            public double getPrice(int days) {
                return 0;
            }
        };
    }

    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = productUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
