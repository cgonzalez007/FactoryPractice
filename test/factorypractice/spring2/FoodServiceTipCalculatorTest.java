package factorypractice.spring2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cgonz
 */
public class FoodServiceTipCalculatorTest {

    private FoodServiceTipCalculator instance;

    public FoodServiceTipCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new FoodServiceTipCalculator();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetTipCalculation() {
        instance.setInputData(20.0);
        instance.setServiceQuality(ServiceQuality.GOOD);
        assertEquals(4.0, instance.getTip(), 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testGetTipInputDataNull() {
        instance.setServiceQuality(ServiceQuality.GOOD);
        instance.getTip();
    }

    @Test(expected = NullPointerException.class)
    public void testGetServiceQualityNull() {
        instance.setInputData(20.0);
        instance.getTip();
    }

    @Test
    public void testSetInputDataCorrectInput() {
        instance.setInputData(28.80);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInputDataNegativeValue() {
        instance.setInputData(-20.36);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInputDataNullValue() {
        Double nullValue = null;
        instance.setInputData(nullValue);
    }
}
